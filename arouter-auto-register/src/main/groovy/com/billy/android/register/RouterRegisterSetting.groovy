package com.billy.android.register
/**
 * register setting
 * @author billy.qi email: qiyilike@163.com
 * @since 17/3/28 11:48
 */
class RouterRegisterSetting {
    /**
     * The register code is generated into this class
     */
    static final String GENERATE_TO_CLASS_NAME = 'com/alibaba/android/arouter/core/LogisticsCenter'
    /**
     * you know. this is the class file(or entry in jar file) name
     */
    static final String GENERATE_TO_CLASS_FILE_NAME = GENERATE_TO_CLASS_NAME + '.class'
    /**
     * The register code is generated into this method
     */
    static final String GENERATE_TO_METHOD_NAME = 'loadRouterMap'
    /**
     * The package name of the class generated by the annotationProcessor
     */
    static final String ROUTER_CLASS_PACKAGE_NAME = 'com/alibaba/android/arouter/routes/'
    /**
     * The package name of the interfaces
     */
    private static final INTERFACE_PACKAGE_NAME = 'com/alibaba/android/arouter/facade/template/'
    /**
     * scan for classes which implements this interface
     */
    String interfaceName = ''
    /**
     * register method name in class: {@link #GENERATE_TO_CLASS_NAME}
     * for {@link #interfaceName}
     */
    String registerMethodName = ''

    /**
     * jar file which contains class: {@link #GENERATE_TO_CLASS_NAME}
     */
    File fileContainsInitClass
    /**
     * scan result for {@link #interfaceName}
     * class names in this list
     */
    ArrayList<String> classList = new ArrayList<>()

    /**
     * constructor for arouter-auto-register settings
     * @param interfaceName interface to scan
     * @param registerMethod method to generate code into
     */
    RouterRegisterSetting(String interfaceName, String registerMethod){
        this.interfaceName = INTERFACE_PACKAGE_NAME + interfaceName
        this.registerMethodName = registerMethod
    }

}