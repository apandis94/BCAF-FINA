package fina

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

public class klikbutton {
	@Keyword
	public void buttonlain() {
		CucumberKW.comment('Halaman Home Screen')
		
		Mobile.tap(findTestObject('APN_Apply Online/App Fina Revamp/Button Lainnya'), 0)
		
		CucumberKW.comment('Halaman Apple Reguler & Miini For Max')
		
		Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathapplyonline) + 'Homescreen Apply Reguler') + '.png',
			FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('APN_Apply Online/App Fina Revamp/Button Lainnya - Simulasi Budget'), 0)
		
	}
}
