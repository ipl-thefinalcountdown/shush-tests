import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class US6 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Then("the user verifies the share button exists")
	def the_user_verifies_the_shareButton_exists() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.ShareButton), 0)
	}

	@When("the user clicks the share button")
	def the_user_clicks_the_shareButton() {
		Mobile.tap(findTestObject(GlobalVariable.ShareButton), 0)
	}

	@When("the user verifies the Yes button exists")
	def the_user_verifies_the_yesButtonexists() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.ConfirmationDialogYES), 0)
	}

	@And("the user verifies the No button exists")
	def the_user_verifies_the_noButtonexists() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.ConfirmationDialogNO), 0)
	}
	
	@When("the user clicks the No button")
	def the_user_clicks_the_noButton() {
		Mobile.tap(findTestObject(GlobalVariable.ConfirmationDialogNO), 0)
	}
}
