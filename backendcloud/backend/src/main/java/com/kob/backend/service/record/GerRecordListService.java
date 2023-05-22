package com.kob.backend.service.record;

import com.alibaba.fastjson2.JSONObject;

public interface GerRecordListService {
    JSONObject getList(Integer page);
}
