package com.oddfar.campus.business.controller;

import com.oddfar.campus.business.service.IMTService;
import com.oddfar.campus.common.annotation.Anonymous;
import com.oddfar.campus.common.annotation.ApiResource;
import com.oddfar.campus.common.domain.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王唤泳
 * @date 2024/2/4 14:34
 * @description
 */
@RestController
@RequestMapping("/imt/task")
@ApiResource(name = "i茅台任务调度控制器")
@RequiredArgsConstructor
public class CampusIMTTaskController {

    private final IMTService imtService;

    /**
     * 批量申购
     *
     * @return
     */
    @Anonymous
    @GetMapping(value = "/reservationBatch", name = "批量申购")
    public R reservationBatch() {
        imtService.reservationBatch();
        return R.ok();
    }

    /**
     * 获取申购结果
     *
     * @return
     */
    @Anonymous
    @GetMapping(value = "/appointmentResults", name = "获取申购结果")
    public R getAppointmentResults() {
        imtService.appointmentResults();
        return R.ok();
    }

}
