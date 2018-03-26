/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.edurt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

/**
 * UserController <br/>
 * 描述 : UserController <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-03-13 下午2:29 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
@RestController
@RequestMapping(value = {"user"})
public class UserController {

    /**
     * 获取用户集合
     *
     * @return 用户集合数据
     */
    @RequestMapping(value = "list")
    ConcurrentHashMap<String, String> getUserList() {
        ConcurrentHashMap<String, String> userMap = new ConcurrentHashMap<String, String>();
        userMap.put("user1", "user1");
        userMap.put("user2", "user2");
        userMap.put("user3", "user3");
        userMap.put("user4", "user4");
        return userMap;
    }

}