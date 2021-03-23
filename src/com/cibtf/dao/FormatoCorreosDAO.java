package com.cibtf.dao;

import com.cibtf.model.Empresa;

public class FormatoCorreosDAO {
	
	public FormatoCorreosDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFormatoNotificacion(String titulo, String mensaje, int ifBoton) {
		String boton;
		if(ifBoton == 1) {
			boton = "                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
					"                      <td align=\"center\" style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:35px;padding-bottom:35px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:#3BA0DF;background:#3BA0DF;border-width:1px;display:inline-block;border-radius:2px;width:auto;\"><a class=\"es-button\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:20px;color:#FFFFFF;border-style:solid;border-color:#3BA0DF;border-width:15px 30px;display:inline-block;background:#3BA0DF;border-radius:2px;font-weight:normal;font-style:normal;line-height:24px;width:auto;text-align:center;\" href=\"https://cibtf.com/Home/login.jsp\" target=\"_blank\">Acceder a CIBTF</a></span></td> \r\n" + 
					"                     </tr>";
		}else {
			boton = "";
		}
		

		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta name=\"format-detection\" content=\"telephone=no\"> \r\n" + 
				"  <title>Notificacion</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table width=\"100%\" class=\"es-wrapper\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr height=\"0\" class=\"gmail-fix\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td height=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><img width=\"600\" height=\"1\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt src=\"https://esputnik.com/repository/applications/images/blank.gif\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table align=\"center\" class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;background-color:#3BA0DF;\" bgcolor=\"#3ba0df\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-header-body\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img width=\"600\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" alt src=\"https://fmrnnu.stripocdn.email/content/guids/CABINET_09b088a6f827f3cbf9ec0906ae827319/images/9341584956538650.png\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;background-color:#3BA0DF;\" bgcolor=\"#3ba0df\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" bgcolor=\"#ffffff\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">"+titulo+
				"</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\" bgcolor=\"#ffffff\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" bgcolor=\"#ffffff\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-l\" bgcolor=\"#ffffff\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+mensaje+
				"</p></td> \r\n" + 
				"                     </tr>"+boton+
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#87D7FE;\" bgcolor=\"#87d7fe\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#111111;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" esdev-links-color=\"#ffa73b\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Contáctanos en <a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#2992C6;\">bolsaempleo.ad@gmail.com</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-footer\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-footer-body\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal. <br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" class=\"es-infoblock made_with\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" alt src=\"https://fmrnnu.stripocdn.email/content/guids/CABINET_09b088a6f827f3cbf9ec0906ae827319/images/27981584956551566.png\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		return html;
	}

	public String getFormatoAlerta(String titulo, String mensaje, int ifBoton) {
		String boton;
		if(ifBoton == 1) {
			boton = "                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
					"                      <td align=\"center\" style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:35px;padding-bottom:35px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:#E24845;background:#E24845;border-width:1px;display:inline-block;border-radius:2px;width:auto;\"><a class=\"es-button\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:20px;color:#FFFFFF;border-style:solid;border-color:#E24845;border-width:15px 30px;display:inline-block;background:#E24845;border-radius:2px;font-weight:normal;font-style:normal;line-height:24px;width:auto;text-align:center;\" href=\"https://cibtf.com/Home/login.jsp\" target=\"_blank\">Acceder a CIBTF</a></span></td> \r\n" + 
					"                     </tr> ";
		}else {
			boton = "";
		}
		

		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta name=\"format-detection\" content=\"telephone=no\"> \r\n" + 
				"  <title>Alerta</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table width=\"100%\" class=\"es-wrapper\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr height=\"0\" class=\"gmail-fix\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td height=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><img width=\"600\" height=\"1\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt src=\"https://esputnik.com/repository/applications/images/blank.gif\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table align=\"center\" class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;background-color:#E24845;\" bgcolor=\"#e24845\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-header-body\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img width=\"600\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" alt src=\"https://fmrnnu.stripocdn.email/content/guids/CABINET_2273e7b4af82848f27697b38e6ed888b/images/9341584956538650.png\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;background-color:#E24845;\" bgcolor=\"#e24845\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" bgcolor=\"#ffffff\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">"+titulo+
				"</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\" bgcolor=\"#ffffff\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" bgcolor=\"#ffffff\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-l\" bgcolor=\"#ffffff\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+mensaje+
				"</p></td> \r\n" + 
				"                     </tr> "+boton+
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#F98582;\" bgcolor=\"#f98582\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#FFFFFF;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" esdev-links-color=\"#ffa73b\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#090909;\"><strong></strong>Contáctanos en <strong><a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#F42620;\">bolsaempleo.ad@gmail.com</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-footer\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-footer-body\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal. <br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table align=\"center\" class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table width=\"600\" align=\"center\" class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" cellspacing=\"0\" cellpadding=\"0\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" align=\"center\" valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" class=\"es-infoblock made_with\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" alt src=\"https://fmrnnu.stripocdn.email/content/guids/CABINET_2273e7b4af82848f27697b38e6ed888b/images/27981584956551566.png\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		
		return html;
	}
	
	public String getFormatoError(String nombreError, String descripcionError) {
		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta content=\"telephone=no\" name=\"format-detection\"> \r\n" + 
				"  <title>Error de la Plataforma</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr class=\"gmail-fix\" height=\"0\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" height=\"0\"><img src=\"https://esputnik.com/repository/applications/images/blank.gif\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt width=\"600\" height=\"1\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" bgcolor=\"#e24845\" style=\"padding:0;Margin:0;background-color:#E24845;\"> \r\n" + 
				"           <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"http://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img src=\"https://emoxov.stripocdn.email/content/guids/CABINET_bddfd7182d40628811f563460d00e898/images/18971584825451285.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"600\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td style=\"padding:0;Margin:0;background-color:#E24845;\" bgcolor=\"#e24845\" align=\"center\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">"+nombreError+
				"</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td bgcolor=\"#ffffff\" align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+descripcionError+
				"<br></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#F98582;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#f98582\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#FFFFFF;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td esdev-links-color=\"#ffa73b\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\"><span style=\"font-size:18px;\">Contáctanos en</span>&nbsp;<strong><a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#F42620;\">bolsaempleo.ad@gmail.com</a></strong></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-footer-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal. <br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-infoblock made_with\" align=\"center\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"https://emoxov.stripocdn.email/content/guids/CABINET_bddfd7182d40628811f563460d00e898/images/50631584825695691.png\" alt width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		
		return html;
	}
	
	public String getFormatoNuevaEmpresa(Empresa empresa) {
		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta content=\"telephone=no\" name=\"format-detection\"> \r\n" + 
				"  <title>Solicitud de Nueva Empresa</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr class=\"gmail-fix\" height=\"0\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" height=\"0\"><img src=\"https://esputnik.com/repository/applications/images/blank.gif\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt width=\"600\" height=\"1\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" bgcolor=\"#63d56c\" style=\"padding:0;Margin:0;background-color:#63D56C;\"> \r\n" + 
				"           <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"http://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img src=\"https://emoxov.stripocdn.email/content/guids/CABINET_023ee5b0466c8c43ced7bcbb1ff14187/images/18971584825451285.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"600\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td style=\"padding:0;Margin:0;background-color:#63D56C;\" bgcolor=\"#63d56c\" align=\"center\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">Solicitud de Nueva Empresa</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td bgcolor=\"#ffffff\" align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">El usuario "+empresa.getNombreUsuario()+
				" se ha registrado en la plataforma, favor de validar los datos proporcionados e inicia sesión para aprobar ó rechazar al usuario.</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:20px;Margin:0;font-size:0;\"> \r\n" + 
				"                       <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" align=\"center\" style=\"padding:0;Margin:0;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:25px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:38px;color:#666666;\">Información del Usuario</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" align=\"left\" style=\"padding:0;Margin:0;padding-top:5px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Nombre: "+empresa.getNombreUsuario()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" align=\"left\" style=\"padding:0;Margin:0;padding-top:5px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Apellidos: "+empresa.getApellidosUsuario()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" align=\"left\" style=\"padding:0;Margin:0;padding-top:5px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Correo del Usuario: <a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:none;color:#2CAF46;\" href=\"mailto:"+empresa.getCorreoUsuario()+"\">"+empresa.getCorreoUsuario()+
				"</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:20px;Margin:0;font-size:0;\"> \r\n" + 
				"                       <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" align=\"center\" style=\"padding:0;Margin:0;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:25px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:38px;color:#666666;\">Información de la Empresa</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-content\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table bgcolor=\"#ffffff\" class=\"es-content-body\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:20px;padding-right:20px;\"> \r\n" + 
				"               <!--[if mso]><table width=\"560\" cellpadding=\"0\" cellspacing=\"0\"><tr><td width=\"200\" valign=\"top\"><![endif]--> \r\n" + 
				"               <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-left\" align=\"left\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:left;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"200\" class=\"es-m-p20b\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:10px;padding-bottom:10px;\"> \r\n" + 
				"                       <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Empresa:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Teléfono:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Correo:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Dirección:<br></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Número Exterior:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Colonia:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Código Postal:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">País:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Estado:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Ciudad:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Municipio:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Página Web:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Razón Social:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">RFC:</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table> \r\n" + 
				"               <!--[if mso]></td><td width=\"20\"></td><td width=\"340\" valign=\"top\"><![endif]--> \r\n" + 
				"               <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-right\" align=\"right\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;float:right;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"340\" align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:10px;padding-bottom:10px;padding-right:10px;\"> \r\n" + 
				"                       <table border=\"0\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px 0px 0px 0px;border-bottom:1px solid #CCCCCC;background:none;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getNombreEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getTelefonoEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><a target=\"_blank\" href=\"mailto:"+empresa.getCorreoEmpresa()+"\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:none;color:#2CAF46;\">"+empresa.getCorreoEmpresa()+
				"</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getCalleEmpresa()+
				"<br></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getNoCalleEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getColoniaEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getCpEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getPaisEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getEstadoEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">"+empresa.getCiudadEmpresa()+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><span style=\"text-align:center;\">"+empresa.getMunicipioEmpresa()+
				"</span></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><a target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:none;color:#2CAF46;text-align:center;\" href=\""+empresa.getPaginaEmpresa()+"\">"+empresa.getPaginaEmpresa()+
				"</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"#f9f5f5\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><span style=\"text-align:center;\">"+empresa.getRazonSocialEmpresa()+
				"</span></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" class=\"es-m-txt-c\" bgcolor=\"transparent\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><span style=\"text-align:center;\">"+empresa.getRfcEmpresa()+
				"</span></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table> \r\n" + 
				"               <!--[if mso]></td></tr></table><![endif]--></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:35px;padding-bottom:35px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:#49BE52;background:#63D56C;border-width:1px;display:inline-block;border-radius:2px;width:auto;\"><a href=\"https://cibtf.com/Home/login.jsp\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:20px;color:#FFFFFF;border-style:solid;border-color:#63D56C;border-width:15px 30px;display:inline-block;background:#63D56C;border-radius:2px;font-weight:normal;font-style:normal;line-height:24px;width:auto;text-align:center;\">Iniciar Sesión</a></span></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#B6FBBC;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#b6fbbc\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#111111;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td esdev-links-color=\"#ffa73b\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\">Contáctanos en <a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#2CAF46;\">bolsaempleo.ad@gmail.com</a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-footer-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal. <br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-infoblock made_with\" align=\"center\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"https://emoxov.stripocdn.email/content/guids/CABINET_023ee5b0466c8c43ced7bcbb1ff14187/images/50631584825695691.png\" alt width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		return html;
	}
	
	public String getFormatoContacto(String nombre, String correo, String mensaje) {
		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta content=\"telephone=no\" name=\"format-detection\"> \r\n" + 
				"  <title>Solicitud de Contácto</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr class=\"gmail-fix\" height=\"0\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" height=\"0\"><img src=\"https://esputnik.com/repository/applications/images/blank.gif\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt width=\"600\" height=\"1\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" bgcolor=\"#3ba0df\" style=\"padding:0;Margin:0;background-color:#3BA0DF;\"> \r\n" + 
				"           <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img src=\"https://emoqvz.stripocdn.email/content/guids/CABINET_d1422e7c34e23fee045ee0ae3d863cdc/images/51501584838412021.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"600\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td style=\"padding:0;Margin:0;background-color:#3BA0DF;\" bgcolor=\"#3ba0df\" align=\"center\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" bgcolor=\"transparent\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">Solicitud de Contácto</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td bgcolor=\"#ffffff\" align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">El usuario "+nombre+
				" ha enviado un mensaje para ponerse en contácto con nosótros.<br><br>Correo del usuario remitente: <a target=\"_blank\" href=\"mailto:"+correo+"\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:none;color:#2992C6;\">"+correo+
				"</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Mensaje: "+mensaje+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#87D7FE;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#87d7fe\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#111111;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td esdev-links-color=\"#ffa73b\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Contáctanos en <a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#2992C6;\">bolsaempleo.ad@gmail.com</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-footer-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Si no puedes ver el archivo adjunto favor de comunicarte con el remitente notificandole que el documento no está en el formato correcto</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal.<br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-infoblock made_with\" align=\"center\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"https://emoqvz.stripocdn.email/content/guids/CABINET_d1422e7c34e23fee045ee0ae3d863cdc/images/10301584838714903.png\" alt width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		
		return html;
	}
	
	public String getFormatoEnvioCV(String nombre, String correo, String nombreVacante, String mensaje) {
		String html = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\">\r\n" + 
				" <head> \r\n" + 
				"  <meta charset=\"UTF-8\"> \r\n" + 
				"  <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> \r\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\"> \r\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n" + 
				"  <meta content=\"telephone=no\" name=\"format-detection\"> \r\n" + 
				"  <title>Nuevo Postulante</title> \r\n" + 
				"  <!--[if (mso 16)]>\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"    a {text-decoration: none;}\r\n" + 
				"    </style>\r\n" + 
				"    <![endif]--> \r\n" + 
				"  <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> \r\n" + 
				"  <!--[if !mso]><!-- --> \r\n" + 
				"  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> \r\n" + 
				"  <!--<![endif]--> \r\n" + 
				"  <style type=\"text/css\">\r\n" + 
				"@media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } }\r\n" + 
				"#outlook a {\r\n" + 
				"	padding:0;\r\n" + 
				"}\r\n" + 
				".ExternalClass {\r\n" + 
				"	width:100%;\r\n" + 
				"}\r\n" + 
				".ExternalClass,\r\n" + 
				".ExternalClass p,\r\n" + 
				".ExternalClass span,\r\n" + 
				".ExternalClass font,\r\n" + 
				".ExternalClass td,\r\n" + 
				".ExternalClass div {\r\n" + 
				"	line-height:100%;\r\n" + 
				"}\r\n" + 
				".es-button {\r\n" + 
				"	mso-style-priority:100!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"}\r\n" + 
				"a[x-apple-data-detectors] {\r\n" + 
				"	color:inherit!important;\r\n" + 
				"	text-decoration:none!important;\r\n" + 
				"	font-size:inherit!important;\r\n" + 
				"	font-family:inherit!important;\r\n" + 
				"	font-weight:inherit!important;\r\n" + 
				"	line-height:inherit!important;\r\n" + 
				"}\r\n" + 
				".es-desk-hidden {\r\n" + 
				"	display:none;\r\n" + 
				"	float:left;\r\n" + 
				"	overflow:hidden;\r\n" + 
				"	width:0;\r\n" + 
				"	max-height:0;\r\n" + 
				"	line-height:0;\r\n" + 
				"	mso-hide:all;\r\n" + 
				"}\r\n" + 
				"</style> \r\n" + 
				" </head> \r\n" + 
				" <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> \r\n" + 
				"  <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> \r\n" + 
				"   <!--[if gte mso 9]>\r\n" + 
				"			<v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\r\n" + 
				"				<v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill>\r\n" + 
				"			</v:background>\r\n" + 
				"		<![endif]--> \r\n" + 
				"   <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"     <tr class=\"gmail-fix\" height=\"0\" style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" height=\"0\"><img src=\"https://esputnik.com/repository/applications/images/blank.gif\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt width=\"600\" height=\"1\"></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"      <td valign=\"top\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"       <table class=\"es-header\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:#FFA73B;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-header-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:10px;padding-top:20px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:25px;padding-bottom:25px;font-size:0px;\"><a href=\"https://cibtf.com/Home\" target=\"_blank\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\"><img src=\"https://emoqvz.stripocdn.email/content/guids/CABINET_d821eacd2a9930ae9e1e4e71c1271a01/images/51501584838412021.png\" alt style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\" width=\"600\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td style=\"padding:0;Margin:0;background-color:#FFA73B;\" bgcolor=\"#ffa73b\" align=\"center\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:58px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:48px;font-style:normal;font-weight:normal;color:#111111;\">Nuevo Postulante</h1></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td bgcolor=\"#ffffff\" align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;border-radius:4px;background-color:#FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">El usuario "+nombre+
				" te ha enviado a un nuevo postulante para tu vacante de \""+nombreVacante+"\" en el archivo adjunto de abajo.<br><br>Correo del usuario remitente: <a target=\"_blank\" href=\"mailto:"+correo+"\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:none;color:#FFA73B;\">"+correo+
				"</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-top:20px;padding-bottom:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Mensaje: "+mensaje+
				"</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\"> \r\n" + 
				"                       <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                          <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> \r\n" + 
				"                         </tr> \r\n" + 
				"                       </table></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFECD1;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffecd1\" role=\"presentation\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"center\" style=\"padding:0;Margin:0;padding-top:30px;padding-left:30px;padding-right:30px;\"><h3 style=\"Margin:0;line-height:24px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:20px;font-style:normal;font-weight:normal;color:#111111;\">¿Necesitas Ayuda?</h3></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td esdev-links-color=\"#ffa73b\" align=\"center\" style=\"padding:0;Margin:0;padding-bottom:30px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\">Contáctanos en <a target=\"_blank\" href=\"mailto:bolsaempleo.ad@gmail.com\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:18px;text-decoration:underline;color:#FFA73B;\">bolsaempleo.ad@gmail.com</a></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table cellpadding=\"0\" cellspacing=\"0\" class=\"es-footer\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;background-color:transparent;background-repeat:repeat;background-position:center top;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-footer-body\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-top:30px;padding-bottom:30px;padding-left:30px;padding-right:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"540\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\"><strong><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:14px;text-decoration:underline;color:#111111;\">Comité Interuniversitario de Bolsas de Trabajo y Formación</a></strong></p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Si no puedes ver el archivo adjunto favor de comunicarte con el remitente notificandole que el documento no está en el formato correcto</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Favor de no contestar a este correo, este remitente no admite respuestas</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Este correo fue enviado a través de la plataforma online de CIBTF</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td align=\"left\" style=\"padding:0;Margin:0;padding-top:25px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:14px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:21px;color:#666666;\">Camino Arenero 1101, 45019 Zapopan, Jal. <br>+52 33 3479 2657</p></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table> \r\n" + 
				"       <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> \r\n" + 
				"         <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"          <td align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"           <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> \r\n" + 
				"             <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"              <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> \r\n" + 
				"               <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                 <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                  <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> \r\n" + 
				"                   <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> \r\n" + 
				"                     <tr style=\"border-collapse:collapse;\"> \r\n" + 
				"                      <td class=\"es-infoblock made_with\" align=\"center\" style=\"padding:0;Margin:0;line-height:0px;font-size:0px;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://cibtf.com/Home\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"https://emoqvz.stripocdn.email/content/guids/CABINET_d821eacd2a9930ae9e1e4e71c1271a01/images/10301584838714903.png\" alt width=\"125\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> \r\n" + 
				"                     </tr> \r\n" + 
				"                   </table></td> \r\n" + 
				"                 </tr> \r\n" + 
				"               </table></td> \r\n" + 
				"             </tr> \r\n" + 
				"           </table></td> \r\n" + 
				"         </tr> \r\n" + 
				"       </table></td> \r\n" + 
				"     </tr> \r\n" + 
				"   </table> \r\n" + 
				"  </div>  \r\n" + 
				" </body>\r\n" + 
				"</html>";
		
		return html;
	}

}
