package com.littlejie.scanner;


import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.littlejie.scanner.view.ViewfinderView;

/**
 * Created by Lion on 2016/5/4.
 */
public interface IHandler {

    Handler getHandler();

    /**
     * 处理扫描结果
     *
     * @param result
     * @param barcode
     */
    void handleDecode(Result result, Bitmap barcode);

    ViewfinderView getViewfinderView();

    void drawViewfinder();
}
