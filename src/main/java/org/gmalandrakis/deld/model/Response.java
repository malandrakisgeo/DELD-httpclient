package org.gmalandrakis.deld.model;

import lombok.Data;
import lombok.Generated;

@Generated
@Data
public class Response<T> implements DELDResponse<T> {
    T body;
    int httpStatus = 0;

    private String associatedRequestId;

    private boolean failed;

    private HttpVersion version;

    public Response(T obj){
        body=obj;
    }
    public Response(){
    }
    public boolean isFailed(){
        return String.valueOf(httpStatus).startsWith("4") || String.valueOf(httpStatus).startsWith("5");
    }


}
