import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.exception.StepFailedException
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
import io.appium.java_client.AppiumDriver
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



class US3 {
	String decibel;
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("the user has the application launched")
	def the_user_has_the_application_launched() {
		Mobile.startApplication(GlobalVariable.AppPath, false)
	}

	@When("the user clicks the small record button")
	def the_user_clicks_the_small_recordButton() {
		Mobile.tap(findTestObject(GlobalVariable.SmallAudioRecordButton), 0)
	}

	@Then("the user verifies the small local measurements button exists")
	def the_user_verifies_the_small_localMeasurementsButton_exists() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.LocalMeasurementsButton), 0)
	}

	@When("the user clicks the small local measurements button")
	def the_user_clicks_the_small_localMeasurementsButton() {
		Mobile.tap(findTestObject(GlobalVariable.LocalMeasurementsButton), 0)
	}

	@Then("the user verifies the local measurements menu exist")
	def the_user_verifies_the_LocalMeasurementsMenu_exist() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.LocalMeasurementsMenu), 0)
	}

	@Then("the user verifies the save button is present")
	def the_user_verifies_the_saveButton_is_present() {
		Mobile.verifyElementExist(findTestObject(GlobalVariable.SaveButton), 31)
	}

	@When("the user clicks the save button")
	def the_user_clicks_the_saveButton() {
		decibel = Mobile.getText(findTestObject(GlobalVariable.DecibelCounter), 0)
		Mobile.tap(findTestObject(GlobalVariable.SaveButton), 0)
	}

	@Then("the user verifies the last card has the same noise level as the last measurement")
	def the_user_verifies_the_last_card_has_the_same_noise_level_as_the_last_measurement() {
		AppiumDriver driver = MobileDriverFactory.getDriver()
		List<WebElement> elements = driver.findElements(By.id("pt.ipleiria.taes.shush:id/intensity"))
		WebElement card = elements.get(elements.size() - 1)
		String txt = card.getText()
		Mobile.verifyEqual(txt, decibel)
	}
}
