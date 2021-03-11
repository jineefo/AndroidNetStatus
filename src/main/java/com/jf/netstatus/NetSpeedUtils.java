package com.jf.netstatus;


import com.jf.netstatus.networkspeed.DeviceBandwidthSampler;
import com.jf.netstatus.networkspeed.NetQualityConfig;
import com.jf.netstatus.networkspeed.NetTypeUtils;

public class NetSpeedUtils {
    //设置网络质量问题
    public static void initReqCountChangeNetState(int count) {
        NetQualityConfig.getInstance().initReqCountChangeNetState(count);
    }

    public static void initQuality(int poor, int moderate, int good) {
        NetTypeUtils.setDefaultPoorBandwidth(poor);
        NetTypeUtils.setDefaultModerateBandwidth(moderate);
        NetTypeUtils.setDefaultGoodBandwidth(good);
    }

    public static void startSampling() {
        DeviceBandwidthSampler.getInstance().startSampling();
    }

    public static void stopSampling() {
        DeviceBandwidthSampler.getInstance().stopSampling();
    }
}
