package com.example.moreex.presenter;

public interface LoginCallback extends BaseCallback {
    void onSuccess();

    void onFailure();

    void onComplete();
}
