import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Get directory project'
String baseDir = System.getProperty('user.dir')

Mobile.startApplication('C:\\Users\\Nia Yusniati\\Katalon Studio\\APP - FINA\\Apk\\app-uat-release-sprint-13 (update sdk).apk', 
    false)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.EditText - Email (1)'), findTestData(
        'DMS_Claim_Assurance').getObjectValue('Login', 29), 0)

Mobile.setText(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.EditText - Password'), findTestData('APN_Claim_Assurance').getObjectValue(
        'Pass', 29), 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'CA User & Pass - Login') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.Button - Login'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.LinearLayout(AccountView)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathklaimasuransi) + 'Account') + '.png', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APN_FINA_ClaimAsuransi/Fina1 (Login)/android.widget.LinearLayout(HomeView)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

