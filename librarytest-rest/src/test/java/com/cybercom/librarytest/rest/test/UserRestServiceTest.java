/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybercom.librarytest.rest.test;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.http.client.ClientProtocolException;

import org.junit.Test;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 *
 * @author testautom-nack
 */
public class UserRestServiceTest extends TestBase{

    String restUrl = "http://localhost:8080/librarytest/books";

    @Test
    public void test() {
        //Given: set up the input for the action under test (test data, mocks, stubs)
        //When: execute the action you want to test.
        //Then: check the output with assertions
    }

    @Test
    public void testGetAllUsers() throws ClientProtocolException, IOException {

//        UserRestService userRestService = new UserRestService();
//        //Given        
//        HttpUriRequest request = new HttpGet(uri + "/users");
//        //When
//        HttpResponse httpresponse = HttpClientBuilder.create().build().execute(request);
//        URLConnection urlConnection
//        //Then
//        assertThat(httpresponse.getStatusLine().getStatusCode(), equalTo(HttpStatus.SC_OK));

//         ----------        this.url = new URL(restUrl+"/namn/"+outputStream.toString("UTF-8"));
//                         this.httpConn= (HttpURLConnection) this.url.openConnection();
//                         this.getHttpConn().setRequestMethod("GET");
//                         this.getHttpConn().setRequestProperty("Accept", "application/xml");
//                         
//                         int responseCode = httpConn.getResponseCode();
//                         InputStream inputStream=null;
//                         if(responseCode==200){               
//                                     inputStream = httpConn.getInputStream();
//                         }else{
//                                     this.logger.debug("Fel från tjänsten med returnkod ".concat(String.valueOf(responseCode)).concat(" och responsemessage: ").concat( httpConn.getResponseMessage()));
//                         }
//  
//                 --------------"
        HttpURLConnection httpConnection = null;
        URL url = new URL(restUrl + "/users");

        httpConnection = (HttpURLConnection) url.openConnection();

        httpConnection.setRequestMethod("GET");
        httpConnection.setRequestProperty("Accept", "application/xml");

        int responseCode = httpConnection.getResponseCode();

        InputStream inputStream = null;

        if (responseCode == 200) {
            inputStream = httpConnection.getInputStream();
        }

    }

}
