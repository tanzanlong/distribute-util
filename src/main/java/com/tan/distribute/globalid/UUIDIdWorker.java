package com.tan.distribute.globalid;

import java.util.UUID;

public class UUIDIdWorker {
public String getId(){
    return UUID.randomUUID().toString();
}
}
