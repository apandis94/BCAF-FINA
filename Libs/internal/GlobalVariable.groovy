package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object FINAURL
     
    /**
     * <p></p>
     */
    public static Object FINAID
     
    /**
     * <p></p>
     */
    public static Object FINAPass
     
    /**
     * <p></p>
     */
    public static Object sprint3sspathMobile
     
    /**
     * <p></p>
     */
    public static Object sspathapplyonline
     
    /**
     * <p></p>
     */
    public static Object sspathasuransicakpro
     
    /**
     * <p></p>
     */
    public static Object sspathasuransiraksa
     
    /**
     * <p></p>
     */
    public static Object edit_role1
     
    /**
     * <p></p>
     */
    public static Object edit_role2
     
    /**
     * <p></p>
     */
    public static Object FINA_Username
     
    /**
     * <p></p>
     */
    public static Object FINA_cust
     
    /**
     * <p></p>
     */
    public static Object FINA_username_Add
     
    /**
     * <p></p>
     */
    public static Object FINA_cust_notfound
     
    /**
     * <p></p>
     */
    public static Object FINA_email_login1
     
    /**
     * <p></p>
     */
    public static Object FINA_email_login2
     
    /**
     * <p></p>
     */
    public static Object FINA_password_login
     
    /**
     * <p></p>
     */
    public static Object FINA_Rolename
     
    /**
     * <p></p>
     */
    public static Object sspathcekhome
     
    /**
     * <p></p>
     */
    public static Object sspathcekvalidasilogin
     
    /**
     * <p></p>
     */
    public static Object sspathreservasibpkb1
     
    /**
     * <p></p>
     */
    public static Object sspathreservasibpkb2
     
    /**
     * <p></p>
     */
    public static Object sspathepoliscakpro
     
    /**
     * <p></p>
     */
    public static Object sspathregresi
     
    /**
     * <p></p>
     */
    public static Object ResvBPKBURL
     
    /**
     * <p></p>
     */
    public static Object sspathklaimasuransi
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            FINAURL = selectedVariables['FINAURL']
            FINAID = selectedVariables['FINAID']
            FINAPass = selectedVariables['FINAPass']
            sprint3sspathMobile = selectedVariables['sprint3sspathMobile']
            sspathapplyonline = selectedVariables['sspathapplyonline']
            sspathasuransicakpro = selectedVariables['sspathasuransicakpro']
            sspathasuransiraksa = selectedVariables['sspathasuransiraksa']
            edit_role1 = selectedVariables['edit_role1']
            edit_role2 = selectedVariables['edit_role2']
            FINA_Username = selectedVariables['FINA_Username']
            FINA_cust = selectedVariables['FINA_cust']
            FINA_username_Add = selectedVariables['FINA_username_Add']
            FINA_cust_notfound = selectedVariables['FINA_cust_notfound']
            FINA_email_login1 = selectedVariables['FINA_email_login1']
            FINA_email_login2 = selectedVariables['FINA_email_login2']
            FINA_password_login = selectedVariables['FINA_password_login']
            FINA_Rolename = selectedVariables['FINA_Rolename']
            sspathcekhome = selectedVariables['sspathcekhome']
            sspathcekvalidasilogin = selectedVariables['sspathcekvalidasilogin']
            sspathreservasibpkb1 = selectedVariables['sspathreservasibpkb1']
            sspathreservasibpkb2 = selectedVariables['sspathreservasibpkb2']
            sspathepoliscakpro = selectedVariables['sspathepoliscakpro']
            sspathregresi = selectedVariables['sspathregresi']
            ResvBPKBURL = selectedVariables['ResvBPKBURL']
            sspathklaimasuransi = selectedVariables['sspathklaimasuransi']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
