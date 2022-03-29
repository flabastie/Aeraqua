// create todayDate
java.time.LocalDate todayDate = java.time.LocalDate.now();
String todayDateStr = todayDate.toString();

// Create String location
String lon=String.valueOf(row1.ville_longitude_deg);
String lat=String.valueOf(row1.ville_latitude_deg);
String location = lon + "," + lat;

// Create Strings for labels
String str1 = "{\"api_type\":\"air\",\"date_insert\":\"";
String str2 = "\",\"code_commune\":\"";
String str3 = "\",\"location\":\"";
String str4 = "\",\"message\":";
String str5 = "}";
 
// Append Strings for final message
String strFinal = new StringBuilder(str1)
.append(todayDateStr)
.append(str2)
.append(row1.ville_code_commune)
.append(str3)
.append(location)
.append(str4)
.append(input_row.string)
.append(str5)
.toString();
 
//System.out.println(strFinal);
output_row.messageContent = strFinal;