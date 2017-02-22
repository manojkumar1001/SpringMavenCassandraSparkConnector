package com.example;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.datastax.spark.connector.japi.CassandraJavaUtil;
import com.datastax.spark.connector.japi.CassandraRow;
import com.datastax.spark.connector.japi.rdd.CassandraTableScanJavaRDD;

@SpringBootApplication
public class SparkTrialApplication {

	private static JavaSparkContext sc;

	public static void main(String[] args) {
		SpringApplication.run(SparkTrialApplication.class, args);
		SparkConf conf = new SparkConf().setMaster("local").setAppName("manoj").set("spark.cassandra.connection.host",
				"192.168.10.101");
		sc = new JavaSparkContext(conf);
		CassandraTableScanJavaRDD<CassandraRow> rdd = CassandraJavaUtil.javaFunctions(sc).cassandraTable("mykeyspace", "test");
		System.err.println(rdd.cassandraCount());
	}
}
