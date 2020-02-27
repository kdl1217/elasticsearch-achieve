package com.es.controller;

import com.es.bean.Sample;
import com.es.elastic.Elasticsearch;
import com.es.share.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Sample Controller
 *
 * @author Kong, created on 2020-02-27T17:45.
 * @since 1.0.0-SNAPSHOT
 */
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @Autowired
    private Elasticsearch elasticsearch;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add() {
        String index = Constant.SAMPLE_INDEX;
        String type = Constant.SAMPLE_TYPE;

        Sample sample = new Sample();
        sample.setId(UUID.randomUUID().toString().replaceAll("-",""));
        sample.setDeviceCode("Incar"+ 10000 * (Math.random()));
        sample.setTripNo((int) (10 * (Math.random())));
        sample.setSpeed((int) (100 * (Math.random())));
        sample.setDistance((int) (100 * (Math.random())));
        sample.setLongitude(Math.random()*100);
        sample.setLatitude(Math.random()*30);
        sample.setAngle((int) (90 * (Math.random())));
        sample.setCollectTime(new Date());

        elasticsearch.save(index, type, sample.getId(), sample);
    }


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Sample> get() {
        String index = Constant.SAMPLE_INDEX;
        String type = Constant.SAMPLE_TYPE;



        return elasticsearch.getData(index, type, null, Sample.class);
    }
}
