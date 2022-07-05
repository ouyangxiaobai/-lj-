package com.qcl.service.impl;

import com.qcl.dataobject.OrderMaster;
import com.qcl.dto.OrderDTO;
import com.qcl.enums.OrderStatusEnum;
import com.qcl.enums.ResultEnum;
import com.qcl.exception.SellException;
import com.qcl.repository.OrderMasterRepository;
import com.lly835.bestpay.model.RefundResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * 编程小石头：2501902696（微信）
 */
@Service
@Slf4j
public class PayService {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    //    @Autowired
    //    private OrderService orderService;

    public OrderDTO goPay(OrderDTO orderDTO) {
        //判断订单状态
        if (!orderDTO.getOrderStatus().equals(OrderStatusEnum.NEW.getCode())) {
            log.error("【支付订单】订单状态不正确, orderId={}, orderStatus={}", orderDTO.getOrderId(),
                    orderDTO.getOrderStatus());
            throw new SellException(ResultEnum.ORDER_STATUS_ERROR);
        }
        //修改订单状态
        OrderMaster orderMaster = new OrderMaster();

        orderDTO.setOrderStatus(OrderStatusEnum.NEW_PAYED.getCode());//已支付
        BeanUtils.copyProperties(orderDTO, orderMaster);
        OrderMaster updateResult = orderMasterRepository.save(orderMaster);
        if (updateResult == null) {
            log.error("【支付订单】更新失败, orderMaster={}", orderMaster);
            throw new SellException(ResultEnum.ORDER_UPDATE_FAIL);
        }
        return orderDTO;
    }


    //退款
    public RefundResponse refund(OrderDTO orderDTO) {
        //        RefundRequest refundRequest = new RefundRequest();
        //        refundRequest.setOrderId(orderDTO.getOrderId());
        //        refundRequest.setOrderAmount(orderDTO.getOrderAmount().doubleValue());
        //        refundRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_H5);
        //        log.info("【微信退款】request={}", JsonUtil.toJson(refundRequest));
        //
        //        RefundResponse refundResponse = bestPayService.refund(refundRequest);
        //        log.info("【微信退款】response={}", JsonUtil.toJson(refundResponse));

        return null;
    }
}
