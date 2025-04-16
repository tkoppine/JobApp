package com.codewithteja.JobApp.service;

import com.codewithteja.JobApp.model.JobPost;
import com.codewithteja.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    // To add job
    public void addJob(JobPost jobPost)
    {
        repo.addJob(jobPost);
    }

    // Retrieve all Job Posts
    public List<JobPost> getAllJobPosts()
    {
        return repo.getAllJobPosts();
    }
}
