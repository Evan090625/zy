<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="struts-tags.tld" %>
<%@ include file="/js/org/orgInfoUpdate_js.jsp"%>

<script src="js/jqueryTabs.js" type="text/javascript"></script>
<link href="css/org/orgInfoUpdate.css" rel="stylesheet" type="text/css"/>

<div class="orgInfo_container">
    <div class="testtab" id="testtab2">
        <div id="tabtag2" class="tabtag">
            <ul class="tabtag_ul">
                <div class="left_bottom"></div>
                <li id="tabtag_1" class="cur"><s:property value="%{getText('org.info.update.orgResInfo')}" /></li>
                <li id="tabtag_2"><s:property value="%{getText('org.info.update.orgInfo')}" /></li>
                <li id="tabtag_3"><s:property value="%{getText('org.info.update.orgContact')}" /></li>
                <li id="tabtag_4"><s:property value="%{getText('org.info.update.material')}" /></li>
                <div class="right_bottom"></div>
            </ul>
        </div>
        <div id="tabcon2" class="tabcon">

            <div id="tabtag_1con">
                <s:form action="orgSaveResPerson" method="POST">
                <div class="tip_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param1')}"/></div>
                <ul class="principalMsg">
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param2')}"/></p><p id="secondStepNameWarn" class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield  name="responser.userName" id="secondStepName" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <div class="option_tittle"></span><s:property value="%{getText('orgInfoUpdate.param3')}"/></div>
                        <div class="input_content">
                            <%--<input name="responser.sexy" id="secondStepRadiotrue" type="radio" value="true">--%>
                            <%--<label for="secondStepRadiotrue">男</label>--%>
                            <%--<input name="responser.sexy" id="secondStepRadiofalse"type="radio" value="false">--%>
                            <%--<label for="secondStepRadiofalse">女</label>--%>
                            <s:radio list="#{true:getText('orgInfoUpdate.param4'),false:getText('orgInfoUpdate.param5')}" name="responser.sexy" cssClass="usersexy" listKey="key" listValue="value"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><s:property value="%{getText('orgInfoUpdate.param6')}"/></p><p id="secondStepBirthdayWarn" class="input_msg"></p>
                        <div class="input_content">
                                <s:textfield name="responser.birthDay" value="" readonly="readonly" id="birday" cssClass="Wdatepicker input_text_field"/>
                                 <script type="text/javascript">
                                        $(document).ready(function () {
                                             $("#birday").attr('value','<s:date  name="responser.birthDay" format="%{getText('global.display.date')}"/>');
                                        });
                                </script>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param7')}"/></p><p id="secondStepContactWarn" class="input_msg"></p>

                        <div class="input_content">
                            <s:textfield name="responser.telphone" id="secondStepContact" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param8')}"/></p>
                        <p id="secondStepIDWarn" class="input_msg"></p>

                        <div class="input_content">
                            <%--<input name="responser.cardId" id="secondStepID"--%>
                                   <%--class="input_text_field" type="text">--%>
                            <s:textfield name="responser.cardId" id="secondStepID" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param9')}"/></p><p id="fileupload1_FileWarn" class="input_msg"></p><br/>
                        <div class="input_content">
                            <p class="img_div"><img  id="file1_preview_img" src="<s:property value="responser.idCardUrl"/>" width="120px" height="90px" onerror="javascript:this.src='images/nopic.jpg'"/></p>
                            <p class="file_upload">
                                <input type="file" name="upload" id="fileupload1" />
                            </p>
                            <input type="hidden" id="idCardUrl" name="responser.idCardUrl"/>
                        </div>
                    </li>
                    <li class="commit_modfication1">
                        <span id="submit_msg1" class="_submit_msg"></span>
                        <span><s:submit cssClass="submit_btn" value="%{getText('orgInfoUpdate.param10')}"/></span>
                    </li>
                </ul>
            </s:form>
            </div>

            <div id="tabtag_2con">
                <s:form action="orgSaveOrgInfo" method="POST">
                <div class="tip_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param1')}"/></div>
                <ul>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param11')}"/></p>
                        <p id="orgNameWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.schoolName" id="thirdStepName" cssClass="input_text_field" />
                        </div>
                    </li>
                    <li class="orgShuoming">
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param12')}"/></p>
                        <div id="orgShuomingWarn"  class="input_msg"></div>
                        <div class="input_content">
                            <s:textarea name="org.description" cols="20" rows="5" id="thirdStepOrgShuoming" cssClass="descArea"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param13')}"/></p>
                        <p id="bankNameWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.depositBankName" id="bankName" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param14')}"/></p>
                        <p id="accountNameWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.depositName" id="thirdStepAccount" cssClass="input_text_field" type="text"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param15')}"/></p>
                        <p id="accountNoWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.depositBankAccount" id="thirdStepAccountNo" cssClass="input_text_field" type="text"/>
                        </div>
                    </li>
                    <li class="orgScale">
                            <div class="option_tittle"><s:property value="%{getText('orgInfoUpdate.param16')}"/></div>
                            <div class="input_content" style="width: 460px;">
                                <div id="wwgrp_orgForm_org_memberSize" class="wwgrp">
                                    <div id="wwctrl_orgForm_org_memberSize" class="wwctrl">
                                        <s:radio list="#{0:getText('orgleague.info.size1'),1:getText('orgleague.info.size2'),2:getText('orgleague.info.size3'),3:getText('orgleague.info.size4'),4:getText('orgleague.info.size5'),5:getText('orgleague.info.size6')}" name="org.memberSize" cssClass="usersexy" listKey="key" listValue="value"/>
                                    </div>
                                </div>
                            </div>
                    </li>
                    <li>
                            <div class="option_tittle"><s:property value="%{getText('orgInfoUpdate.param17')}"/></div>
                            <div id="wwgrp_orgForm_org_multipleOrg" class="wwgrp input_content">
                                <div id="wwctrl_orgForm_org_multipleOrg" class="wwctrl">
                                     <s:radio list="#{true:getText('orgInfoUpdate.param17.1'),false:getText('orgInfoUpdate.param17.2')}" name="org.multipleOrg" cssClass="usersexy" listKey="key" listValue="value"/>
                                </div>
                            </div>
                    </li>
                    <li class="fileUploadDiv">
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%getText('orgInfoUpdate.param18')"/></p><p id="fileupload2_FileWarn" class="input_msg"></p><br/>
                        <div class="input_content">
                            <p class="img_div"><img id="file2_preview_img" src="<s:property value="org.logoUrl"/>" width="120px" height="90px" onerror="javascript:this.src='images/nopic.jpg'"/></p>
                            <p class="file_upload"><input type="file" name="upload" id="fileupload2" /></p>
                            <input type="hidden" name="org.logoUrl" id="hidFile1"/>
                        </div>
                    </li>
                    <li class="fileUploadDiv">
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%getText('orgInfoUpdate.param19')"/></p><p id="fileupload3_FileWarn" class="input_msg"></p><br/>
                        <div class="input_content">
                            <p class="img_div"><img  id="file3_preview_img" src="<s:property value="org.businessLicenseUrl"/>" width="120px" height="90px" onerror="javascript:this.src='images/nopic.jpg'"/></p>
                            <p class="file_upload"><input type="file" name="upload" id="fileupload3" /></p>
                            <input type="hidden" name="org.businessLicenseUrl" id="hidFile2"/>
                        </div>
                    </li>
                    <li class="commit_modfication2">
                         <span id="submit_msg2" class="_submit_msg"></span>
                        <span><s:submit cssClass="submit_btn" value="%{getText('orgInfoUpdate.param10')}"/></span>
                    </li>

                </ul>
            </s:form>
            </div>

            <div id="tabtag_3con">
                <s:form action="orgSaveContactInfo" method="POST">
                <div class="tip_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param1')}"/></div>
                <ul>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param20')}"/></p>
                        <p id="thirdStepOfficerNameWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.contactName" id="thirdStepOfficerName" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param21')}"/></p>
                        <p id="thirdStepfixedTelWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.telPhone" id="thirdStepfixedTel" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                        <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param22')}"/></p>
                        <p id="thirdStepMobileWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.cellPhone" id="thirdStepMobile" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                         <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param23')}"/></p>
                        <p id="thirdStepAddressWarn"  class="input_msg"></p>
                        <div class="input_content">
                            <s:textfield name="org.businessAddress" id="thirdStepAddress" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li>
                         <p class="option_tittle"><span style="color:red;">&nbsp;*&nbsp;</span><s:property value="%{getText('orgInfoUpdate.param24')}"/></p>
                        <p id="thirdStepPostCodeWarn"  class="input_msg"></p>
                        <div class="input_content">
                             <s:textfield name="org.zipCode" id="thirdStepPostCode" cssClass="input_text_field"/>
                        </div>
                    </li>
                    <li class="commit_modfication3">
                        <span id="submit_msg3" class="_submit_msg"></span>
                        <span><s:submit cssClass="submit_btn" value="%{getText('orgInfoUpdate.param10')}"/></span>
                    </li>
                </ul>
                </s:form>
            </div>
            <div id="tabtag_4con" style="display:none;">
                <h3><s:property value="%{getText('orgInfoUpdate.param25')}"/></h3>
                <s:form action="saveOrgAdvertiseFile" method="POST" enctype="multipart/form-data">
                <ul>
                    <li><span class="tip_words"><s:property value="%{getText('orgInfoUpdate.param26')}"/></span><input type="file" name="upload" /></li>
                    <li><span class="tip_words"><s:property value="%{getText('orgInfoUpdate.param27')}"/></span><textarea name="orgMaterial.description" placeholder="<s:property value="%{getText('orgInfoUpdate.param26.2')}"/>"></textarea></li>
                    <li><s:submit cssClass="submit_material_btn" value="%{getText('orgInfoUpdate.param27.1')}"/></li>
                </ul>
                </s:form>
                <h3><s:property value="%{getText('orgInfoUpdate.param28')}"/></h3>
                <table>
                    <tr>
                        <td width="100px;"><s:property value="%{getText('orgInfoUpdate.param29')}"/></td>
                        <td width="100px;"><s:property value="%{getText('orgInfoUpdate.param30')}"/></td>
                        <td width="150px;"><s:property value="%{getText('orgInfoUpdate.param31')}"/></td>
                        <td width="100px;"><s:property value="%{getText('orgInfoUpdate.param32')}"/></td>
                        <td width="200px;"><s:property value="%{getText('orgInfoUpdate.param33')}"/></td>
                        <td width="100px;"><s:property value="%{getText('orgInfoUpdate.param34')}"/></td>
                    </tr>
                    <s:iterator value="orgMaterials">
                    <tr>
                        <td><s:property value="sourceTitle"/></td>
                        <td><s:property value="provider.nickName"/></td>
                        <td><s:date name="provideTime" format="%{getText('dateformat.forclass')}"/></td>
                        <td>20M</td>
                        <td><s:property value="description"/></td>
                        <td><a href="orgMaterialDownload.html?orgMaterial.id=<s:property value="id"/>"><s:property value="%{getText('orgInfoUpdate.param34')}"/></a></td>
                    </tr>
                    </s:iterator>
                </table>

            </div>

        </div>
    </div>
</div>
