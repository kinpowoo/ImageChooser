/*
 *
 * ChooserSetting.java
 * 
 * Created by Wuwang on 2016/10/31
 * Copyright © 2016年 深圳哎吖科技. All rights reserved.
 */
package com.wuwang.imagechooser;


/**
 * Description:
 */
public class ChooserSetting{

    public static int TITLE_COLOR;

    /**图片选择页，每行显示数*/
    public static int NUM_COLUMNS=3;

    /**图片加载失败的图片*/
    public static int errorResId=0;

    /**图片加载的占位图片*/
    public static int placeResId=0;

    /**图片加载的动画*/
    public static int loadAnimateResId=0;

    /**选中图片的滤镜颜色*/
    public static int chooseFilter=0;

    /**未被选中的图片的滤镜颜色*/
    public static int unChooseFilter=0;

    /**最新的图片集合显示名字*/
    public static String newestAlbumName="最新图片";

    /**最新图片集合的最大数量*/
    public static int newestAlbumSize=100;

}
