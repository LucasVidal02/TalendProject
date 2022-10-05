package Execution;

import Data.Examples.MockData.StringDump;
import TalendJobCaller.JobCaller;

public class RunCall {
    public static void main(String[] args) {
        JobCaller callJob = new JobCaller();
        callJob.runJob("Test Job Execution");
        // scanner pro user setar a linha? valor forçado por hora
        int nb_line = 1;
        // faz o append
        // ver no output.txt se realmente funcionou
        // acho que dá pra ver na aplicação também
        String[] context = new String[] {"--context_param nb_line=" + nb_line,"--context_param first_name="+ StringDump.firstName +
        "--context_param last_name=" + StringDump.lastName + "--context_param car_color=" + StringDump.carColor};
        runJob.runJob(context);
    }
}
