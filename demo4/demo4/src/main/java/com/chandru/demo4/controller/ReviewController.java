package com.chandru.demo4.controller;

import com.chandru.demo4.model.ReviewBody;
import com.chandru.demo4.model.ReviewEntity;
import com.chandru.demo4.model.SeriesEntity;
import com.chandru.demo4.model.User;
import com.chandru.demo4.repository.ReviewRepo;
import com.chandru.demo4.service.SeriesService;
import com.chandru.demo4.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ReviewController {

    @Autowired
    public ReviewRepo repo;

    @Autowired
    private Userservice ser;

    @Autowired
    private SeriesService service;





    @PostMapping("/addreview")
    public String addReview(@RequestBody ReviewBody body)
    {
        String tempName=body.getCreatedBy();
        Long tempSeriesId = body.getSeriesId();
        List<SeriesEntity> seriesEntityList = service.getSeries();
        List<User> usersInfoList = ser.get();
        ReviewEntity entity = new ReviewEntity();
        //System.out.println("size"+usersInfoList.size());


            Long tempid = Long.valueOf(0);

            for (SeriesEntity seriesinfo:seriesEntityList) {

                if(tempSeriesId == seriesinfo.getSerId())
                {

                    System.out.println(tempSeriesId);
                    tempid = seriesinfo.getSerId();
                    entity.setSeriesId(tempid);
                    entity.setAvailability(seriesinfo.getAvailability());
                    entity.setCategory(seriesinfo.getCategory());
                    entity.setName(seriesinfo.getName());
                    entity.setSeries_year(seriesinfo.getSeries_year());
                    break;
                }

            }



        Integer tempuserid = 0;

        for (User info: usersInfoList) {

           if (tempName.toLowerCase().equals(info.getUserName().toLowerCase()))
            {
                tempuserid = info.getUserID();
                entity.setUserId(tempuserid);
                break;

            }
        }

        entity.setCreatedDate(body.getCreatedDate());
        entity.setModifiedDate(body.getModifiedDate());
        entity.setScore(body.getScore());
        entity.setSeriesId(body.getSeriesId());
        repo.save(entity);
        return "review added successfully";

    }


    @RequestMapping(value ="topyear/{year}/{score}", method= RequestMethod.GET )
    public List<ReviewEntity> topreview(@PathVariable String year, @PathVariable Integer score)
    {

        int scoreint = score.intValue();
        List<ReviewEntity> rEList = repo.findAll();
        List<ReviewEntity> reviewEntityListyear = new ArrayList<>();
        List<ReviewEntity> reviewEntityListyear2 = new ArrayList<>();

        for (ReviewEntity rE:
             rEList) {

            if(year.toLowerCase().equals(rE.getSeries_year().toLowerCase()))
            {
               reviewEntityListyear.add(rE);

            }

        }
        reviewEntityListyear2 = reviewEntityListyear.stream()
                .sorted((o1, o2) -> o2.getScore()- o1.getScore()).collect(Collectors.toList());

         return reviewEntityListyear2;

    }

   @RequestMapping(value = "topIngenre/{score}/{genre}",method = RequestMethod.GET)
    public ArrayList<ReviewEntity> topIngenre(@PathVariable Integer score, @PathVariable String genre)
   {
       int scoreint = score.intValue();

       List<ReviewEntity> reviewEntityList = repo.findAll();
       List<ReviewEntity> reviewEntityList1 = new ArrayList<>();
       List<ReviewEntity> reviewEntityList2 = new ArrayList<>();
       for (ReviewEntity R:
            reviewEntityList) {
           if(genre.toLowerCase().equals(R.getCategory().toLowerCase()))
           {

               reviewEntityList1.add(R);

           }
       }
       reviewEntityList2 = reviewEntityList1.stream()
               .sorted((o1, o2) -> o2.getScore()- o1.getScore()).collect(Collectors.toList());
       return (ArrayList<ReviewEntity>) reviewEntityList2;
   }

}
