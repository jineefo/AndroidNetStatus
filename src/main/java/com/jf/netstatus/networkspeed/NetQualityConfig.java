package com.jf.netstatus.networkspeed;

public class NetQualityConfig {
     static NetQualityConfig netQualityConfig = new NetQualityConfig();

    private NetQualityConfig() {
    }

    public static NetQualityConfig getInstance() {
        if (netQualityConfig == null) {
            netQualityConfig = new NetQualityConfig();
        }
        return netQualityConfig;
    }

    public void initReqCountChangeNetState(int count) {
        ConnectionClassManager.DEFAULT_SAMPLES_TO_QUALITY_CHANGE = count;
    }

    public void initQuality(int poor, int moderate, int good) {
        ConnectionClassManager.getInstance().setDefaultGoodBandwidth(good);
        ConnectionClassManager.getInstance().setDefaultModerateBandwidth(moderate);
        ConnectionClassManager.getInstance().setDefaultPoorBandwidth(poor);
    }
}
