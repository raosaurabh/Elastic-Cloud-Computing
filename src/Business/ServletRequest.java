/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Saurabh
 */
public class ServletRequest {
    private static int count=0;
    private int requestId;
    
    public ServletRequest()
    {
        count++;
        requestId=count;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}
