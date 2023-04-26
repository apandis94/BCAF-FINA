<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>pembayaran billing VA</description>
   <name>Payment VA</name>
   <tag></tag>
   <elementGuidId>8baabc6b-93c1-4ff7-bb36-aaf3565bdd14</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;Data\&quot;: {\n        \&quot;CompanyCode\&quot;: \&quot;${c_code}\&quot;,\n        \&quot;CustomerNumber\&quot;: \&quot;${cust_no}\&quot;,\n        \&quot;RequestID\&quot;: \&quot;${req_id}\&quot;,\n        \&quot;ChannelType\&quot;: \&quot;${channel_type}\&quot;,\n        \&quot;CustomerName\&quot;: \&quot;${cust_name}\&quot;,\n        \&quot;CurrencyCode\&quot;: \&quot;IDR\&quot;,\n        \&quot;PaidAmount\&quot;: \&quot;${paid_amount}\&quot;,\n        \&quot;TotalAmount\&quot;: \&quot;${total_amount}\&quot;,\n        \&quot;SubCompany\&quot;: \&quot;00000\&quot;,\n        \&quot;TransactionDate\&quot;: \&quot;${trans_date}\&quot;,\n        \&quot;Reference\&quot;: \&quot;${ref}\&quot;,\n        \&quot;DetailBills\&quot;: null,\n        \&quot;FlagAdvice\&quot;: \&quot;N\&quot;,\n        \&quot;Additionaldata\&quot;: null\n    },\n    \&quot;Source\&quot;: \&quot;BCAFAPPS\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic YmNhZmFwcHM6QWRtaW4xMjM=</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://192.168.29.71:12103/VirtualAccount/PaymentVA_PS</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'55000'</defaultValue>
      <description></description>
      <id>8e9fca83-6405-468e-afa0-7ec7abc79a05</id>
      <masked>false</masked>
      <name>c_code</name>
   </variables>
   <variables>
      <defaultValue>'121100011'</defaultValue>
      <description></description>
      <id>b033bc13-02eb-4a9c-a1c8-33338979cda3</id>
      <masked>false</masked>
      <name>cust_no</name>
   </variables>
   <variables>
      <defaultValue>'1141010324003-1'</defaultValue>
      <description></description>
      <id>086fa68f-2c1e-46ca-9b16-1b6acc13da47</id>
      <masked>false</masked>
      <name>req_id</name>
   </variables>
   <variables>
      <defaultValue>'6015'</defaultValue>
      <description></description>
      <id>acb08ed9-7cc9-4b34-914a-5de08f5a44ae</id>
      <masked>false</masked>
      <name>channel_type</name>
   </variables>
   <variables>
      <defaultValue>'Lisharyani'</defaultValue>
      <description></description>
      <id>2a9ab280-669c-4d38-8513-fe8f8b778ac8</id>
      <masked>false</masked>
      <name>cust_name</name>
   </variables>
   <variables>
      <defaultValue>'200000.00'</defaultValue>
      <description></description>
      <id>9e8f7d2d-ce73-4152-abf1-ca62fa1c95e1</id>
      <masked>false</masked>
      <name>paid_amount</name>
   </variables>
   <variables>
      <defaultValue>'200000.00'</defaultValue>
      <description></description>
      <id>8eb91064-59b4-4dd8-9b9d-892bb55551e8</id>
      <masked>false</masked>
      <name>total_amount</name>
   </variables>
   <variables>
      <defaultValue>'12/11/2021 12:08:03'</defaultValue>
      <description></description>
      <id>949d67c4-3bd6-468c-9952-b77e8376efe8</id>
      <masked>false</masked>
      <name>trans_date</name>
   </variables>
   <variables>
      <defaultValue>'20200423035'</defaultValue>
      <description></description>
      <id>5931a57c-4e5b-4771-a914-ff6efc18d4c8</id>
      <masked>false</masked>
      <name>ref</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
