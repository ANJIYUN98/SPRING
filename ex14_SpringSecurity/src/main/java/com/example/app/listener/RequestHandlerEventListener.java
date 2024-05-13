package com.example.app.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

public class RequestHandlerEventListener implements ApplicationListener<RequestHandledEvent>{

	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		System.out.println("[RequestHandlerEventListener] EVENT : " + event.getSource());
		
	}

}
