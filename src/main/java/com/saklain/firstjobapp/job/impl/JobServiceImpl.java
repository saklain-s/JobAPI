package com.saklain.firstjobapp.job.impl;

import com.saklain.firstjobapp.job.Job;
import com.saklain.firstjobapp.job.JobRepository;
import com.saklain.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    //private List<Job> jobs = new ArrayList<>();
    JobRepository jobRespository;
    private Long nextId = 1L;

    public JobServiceImpl(JobRepository jobRespository) {
        this.jobRespository = jobRespository;
    }

// 4:06:27
    @Override
    public List<Job> findAll() {
        return jobRespository.findAll();
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobRespository.save(job);

    }//2:29

    @Override
    public Job getJobById(Long id) {
        return jobRespository.findById(id).orElse(null);
//        for(Job job: jobs){
//            if (job.getId().equals(id)){
//                return job;
//            }
//        }
//        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        try {
            jobRespository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }


//        Iterator<Job> iterator = jobs.iterator();
//        while (iterator.hasNext()){
//            Job job = iterator.next();
//            if (job.getId().equals(id)){
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRespository.findById(id);

            if (jobOptional.isPresent()) {
                Job job = jobOptional.get();
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());
                return true;
            }

        return false;
    }


}
