package bai3;

import java.time.Duration;
import java.time.Instant;


public class StopWatch {
    private Instant startTime ;
    private Instant endTime ;
    public StopWatch(){}
    //khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    public StopWatch(double startTime){
        this.startTime= Instant.now();
    }
    //reset startTime về thời gian hiện tại của hệ thống.
    public void start(){
        this.startTime=Instant.now();
    }
    public void stop(){
        this.endTime=Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public  long getElapsedTime(){

        if (endTime==null){  // chưa gọi end
          Instant currentTime = Instant.now();
            return Duration.between(startTime,currentTime).toMillis();
        }else {
            // đã gọi end
            return  Duration.between(startTime,endTime).toMillis();
        }
    }
}
