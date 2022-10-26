package com.chandru.demo3.controller;


import com.chandru.demo3.model.ReviewBody;
import com.chandru.demo3.model.ReviewEntity;
import com.chandru.demo3.model.UsersInfo;
import com.chandru.demo3.repository.ReviewRepo;
import com.chandru.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    public ReviewRepo repo;

    @Autowired private UserService ser;

    @PostMapping("/addreview")
    public String addReview(@RequestBody ReviewBody body)
    {
        String tempName=body.getCreatedBy();
        List<UsersInfo> usersInfoList = ser.listall();
        //System.out.println("size"+usersInfoList.size());
        Integer tempuserid = 0;
        ReviewEntity entity = new ReviewEntity();
        for (UsersInfo info: usersInfoList) {

            if (tempName.toLowerCase().equals(info.getUserName().toLowerCase()))
            {
                tempuserid = info.getUserid();
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


}
