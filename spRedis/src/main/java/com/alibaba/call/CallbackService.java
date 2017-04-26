package com.alibaba.call;

public interface CallbackService {
	void addListener(String key, CallbackListener listener);
}