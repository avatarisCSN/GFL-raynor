<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ page import="java.util.*, java.text.*, java.sql.Connection, java.sql.ResultSet, java.util.ArrayList, java.sql.SQLException, java.sql.Statement, src.Connector,entity.Zamovl" %>
    <%
   ArrayList<Zamovl> array = new ArrayList<Zamovl>();
    Connection connection;
   
	try {
		connection = Connector.Connect();
      
	Statement statement = connection.createStatement();
	String sql_query =  "SELECT * FROM голубов_диплом.zamovl";
	ResultSet rs = statement.executeQuery(sql_query);
	while (rs.next()) {
 //Zamovl_id
 //Project_id
 //KodZamovl_id
 //DataRegZamovl
 //NameZamovl
 //TypeZamovl
 //StatusZam
 //Prioritet
	      array.add(new Zamovl(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(6),rs.getString(7),rs.getInt(12),rs.getString(14)));
	    
	     }
       int ArraySize = array.size();
	connection.close();
	System.out.println("table is changed");
	} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
		}	
    %>

<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title>Управление тех-заказами</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="Управление-тех-заказами.css" media="screen">
    <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 4.11.3, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "images/default-logo.png"
}</script>
    <meta name="theme-color" content="#478ac9">
    <meta property="og:title" content="Управление тех-заказами">
    <meta property="og:type" content="website">   
  </head>
  <body class="u-body u-xl-mode"><header class="u-clearfix u-header u-header" id="sec-9db7"><div class="u-clearfix u-sheet u-sheet-1">
  
    <form  id="myform1" >
        <a href="https://nicepage.com" class="u-image u-logo u-image-1">
          <img src="images/default-logo.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-align-center u-menu u-menu-dropdown u-offcanvas u-menu-1" data-position="Главное">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Управление-тех-заказами.html" style="padding: 10px 20px;">Замовлення на ТВП</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Список-заданий-заказа.html" style="padding: 10px 20px;">Замовлення</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Редактирование-заказа.html" style="padding: 10px 20px;">Редагування замовлення на ТВП</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="Редактирование-единицы-заказа.html" style="padding: 10px 20px;">Редагування замовлення</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-3-base u-text-hover-palette-2-base" href="редактирование-описа-детали.html" style="padding: 10px 20px;">опис деталі</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
               
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <a class="u-login u-login-1"> Имя користувача</a>
      </div></header>
    <section class="u-align-center u-border-1 u-border-black u-clearfix u-section-1" id="sec-909f">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h4 class="u-text u-text-default u-text-1">Проекти<br>
        </h4>
        <h4 class="u-text u-text-default u-text-2">Перелік замовлень</h4>
        <div class="u-table u-table-responsive u-table-1">

          <table class="u-table-entity">
            <colgroup>
              <col width="100%">
            </colgroup>
            <thead class="u-palette-4-base u-table-header u-table-header-1">
              <tr style="height: 70px;">
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Назва проекту</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
              <%

             try {
            	 connection = Connector.Connect();
             Statement statement = connection.createStatement();
             String sql_query =  "SELECT Name FROM голубов_диплом.project";
             ResultSet rs = statement.executeQuery(sql_query);
             while (rs.next()) {
            	 %>
              <tr style="height: 75px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-2"><%=rs.getString(1)%></td>
              </tr>   
              <% 
                  }
             connection.close();
             } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace();
               }	
               %>

            </tbody>
          </table>
        </div>
        <div class="u-align-left u-table u-table-responsive u-table-2">
          <table class="u-table-entity u-table-entity-2">
            <colgroup>
              <col width="14.2%">
              <col width="14.2%">
              <col width="14.2%">
              <col width="14.2%">
              <col width="14%">
              <col width="14.6%">
              <col width="14.600000000000014%">
            </colgroup>
            <thead class="u-palette-4-base u-table-header u-table-header-2">
              <tr style="height: 21px;">
              <th class="u-border-1 u-border-palette-4-base u-table-cell">Выбор </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Код замовлення </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Номер замовлення </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Дата замовлення </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Назва замовлення </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Тип замовлення</th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Статус замовлення </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Приоритет</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
            
            <% 
          
                for (int i =0; i<array.size(); i++)
                {
                Zamovl zam = (array.get(i));
	        
                
	       %>
                
              <tr style="height: 75px;">

                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-13"><input type="radio" form="myform1" name="radio1" value=<%=zam.getZamovl_id()%>></td>
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-13"><%= zam.getZamovl_id()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getKodZamovl_id()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getDataRegZamovl()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getNameZamovl()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getTypeZamovl()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getStatusZam()%></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= zam.getPrioritet()%></td>
              </tr>
              
              <%
                }
              %>
              
              
            </tbody>
          </table>
        </div>
        <input form="myform1" formaction="${pageContext.request.contextPath}/Редактирование-заказа.jsp" name="btn1" class="u-btn u-btn-round u-button-style u-custom-item u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-1" type="submit" value="Редагувати замовлення ">
        <input form="myform1" formaction="${pageContext.request.contextPath}/Список-заданий-заказа.jsp" name="btn1" class="u-btn u-btn-round u-button-style u-custom-item u-hover-palette-1-light-1 u-palette-1-base u-radius-6 u-btn-1" type="submit" value="Склад замовлення ">
        </form>
      </div>
    </section>
    
    
    
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/website-templates" target="_blank">
        <span>Website Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="" target="_blank">
        <span>Website Builder Software</span>
      </a>. 
    </section>
  </body>
</html>