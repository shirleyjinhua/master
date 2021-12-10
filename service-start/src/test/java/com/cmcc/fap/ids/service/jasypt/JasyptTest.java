package com.cmcc.fap.ids.service.jasypt;/*
 * Project: cube-soho-good
 *
 * File Created at 2021/4/23
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * desc
 *
 * @author jijun
 * @version 1.0.0
 * @date 2021/4/23 9:32
 */
@Slf4j
@SpringBootTest
public class JasyptTest {

    @Resource
    StringEncryptor encryptor;

    @Test
    public void jacketEncrypt() {
        String password = encryptor.encrypt("redis://cmcc2019@172.21.44.85:8379/");
        log.info("password 密文: " + password);

        String password2 = encryptor.encrypt("Fap123!");
        log.info("password2 密文: " + password2);

        String text = encryptor.decrypt("5o/Jlz9yieuha7HPd1S2qLHrFp6mHwby");
        log.info("password 明文：" + text);
        String text2 = encryptor.decrypt("JYsljMqrLbRaA1y2r0+LI6lhJlrqYlfe");
        log.info("password2 明文：" + text2);
    }
}


