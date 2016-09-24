<#include "component://osafe/webapp/osafe/includes/CommonMacros.ftl"/>
<#assign mandatory= request.getAttribute("attributeMandatory")!"N"/>
<div class="${request.getAttribute("attributeClass")!}">
        <label for="PASSWORD"><#if mandatory == "Y"><@required/></#if>${uiLabelMap.PasswordCaption}</label>
        <div class="entryField">
	        <input type="password"  maxlength="60" class="password" name="PASSWORD"  id="PASSWORD" value="${requestParameters.PASSWORD?if_exists}" maxlength="50"/>
	        <input type="hidden" id="PASSWORD_MANDATORY" name="PASSWORD_MANDATORY" value="${mandatory}"/>
	        <span class="entryHelper">
	           <#if REG_PWD_MIN_CHAR?has_content && (REG_PWD_MIN_CHAR == 0 )>
	             <#-- TODO: need to get minimum value from the security.properties because a property is there password.length.min=6-->
	             <#assign REG_PWD_MIN_CHAR = 6 />
	           </#if>
	           <#if REG_PWD_MIN_CHAR?has_content>
	             <#assign passwordHelpText = Static["org.ofbiz.base.util.UtilProperties"].getMessage("OSafeUiLabels", "PassMinLengthInstructionsInfo", Static["org.ofbiz.base.util.UtilMisc"].toMap("REG_PWD_MIN_CHAR", REG_PWD_MIN_CHAR), locale)>
	             <#assign  digitMsgStr = "digits" />
	             <#if REG_PWD_MIN_NUM?has_content && (REG_PWD_MIN_NUM == 1)>
	               <#assign digitMsgStr = "digit" />
	             </#if>
	             <#if REG_PWD_MIN_NUM?has_content && (REG_PWD_MIN_NUM > 0)>
	               <#assign passwordHelpText = passwordHelpText +" "+ Static["org.ofbiz.base.util.UtilProperties"].getMessage("OSafeUiLabels", "PassMinNumInstructionsInfo", Static["org.ofbiz.base.util.UtilMisc"].toMap("REG_PWD_MIN_NUM", REG_PWD_MIN_NUM, "digitMsgStr", digitMsgStr), locale)>
	             </#if>
	             <#assign upperCaseMsgStr = "letters" />
	              <#if REG_PWD_MIN_UPPER?has_content && (REG_PWD_MIN_UPPER == 1)>
	                <#assign upperCaseMsgStr = "letter" />
	              </#if>
	             <#if REG_PWD_MIN_UPPER?has_content && (REG_PWD_MIN_UPPER > 0)>
	               <#assign passwordHelpText = passwordHelpText +" "+ Static["org.ofbiz.base.util.UtilProperties"].getMessage("OSafeUiLabels", "PassMinUpperCaseInstructionsInfo", Static["org.ofbiz.base.util.UtilMisc"].toMap("REG_PWD_MIN_UPPER", REG_PWD_MIN_UPPER, "upperCaseMsgStr", upperCaseMsgStr), locale)>
	             </#if>
	             ${passwordHelpText!}
	           </#if>
	         </span>
	        <@fieldErrors fieldName="PASSWORD"/>
        </div>
</div>