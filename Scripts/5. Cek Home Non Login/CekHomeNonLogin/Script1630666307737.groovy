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

//Mobile.startApplication('D:\\GitHub\\katalon-fina\\apps\\app-uat-release-sprint-11 (06052021).apk', true)
String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'Home') + '.png')

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MenuFavoritSimulasiApplyKredit'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'SimulasiKredit') + '.png')

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MenuFavoritSimulasiBudget'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'SimulasiBudget') + '.png')

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MenuFavoritKreditLainnya'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'KreditLainnya') + '.png')

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MainMenuBilling'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'Billing') + '.png')

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MainMenuAccount'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'Account') + '.png')

Mobile.delay(2)

Mobile.pressBack()

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MainMenuBantuan'), 0)

Mobile.delay(2)

Mobile.takeScreenshot(((baseDir + GlobalVariable.sspathcekhome) + 'Bantuan') + '.png')

Mobile.delay(2)

Mobile.tap(findTestObject('YEP_FINA_Mobile/CekMenuNonLogin/MainMenuHome (2)'), 0)

Mobile.delay(2)
