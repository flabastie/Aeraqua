// create todayDate
java.time.LocalDate todayDate = java.time.LocalDate.now();
String todayDateStr = todayDate.toString();
//System.out.println(todayDateStr);

// Create array location [lon, lat]
float[] location = {row1.ville_longitude_deg, row1.ville_latitude_deg};
System.out.println(location[0]);
System.out.println(location[1]);

String str1 = "{\"api_type\":\"air\",\"date_insert\":\"";
String str2 = "\",\"code_commune\":\"";
String str3 = "\",\"message\":";
String str4 = "}";
 
String strFinal = new StringBuilder(str1)
.append(todayDateStr)
.append(str2)
.append(row1.ville_code_commune)
.append(str3)
.append(input_row.string)
.append(str4)
.toString();
 
//System.out.println(strFinal);
output_row.messageContent = strFinal;