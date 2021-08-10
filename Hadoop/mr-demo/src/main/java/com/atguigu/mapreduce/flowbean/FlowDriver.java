package com.atguigu.mapreduce.flowbean;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class FlowDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        //通过配置文件创建job实例
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf);
        //绑定当前driver
        job.setJarByClass(FlowBean.class);
        //绑定当前mapper和reducer
        job.setMapperClass(FlowMapper.class);
        job.setReducerClass(FlowReducer.class);
        //指定mapper的输出类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(FlowBean.class);
        //指定最终输出类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FlowBean.class);
        //指定输入路径
        FileInputFormat.setInputPaths(job, new Path("E:\\input\\inputFlow"));
        //指定输出路径
        FileOutputFormat.setOutputPath(job, new Path("E:\\output\\outflow"));
        //提交运行
        boolean result = job.waitForCompletion(true);
        System.exit(result ? 0 : 1);
    }
}