package org.example;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("hai");
        PipelineOptions options = PipelineOptionsFactory.create();

        Pipeline pipeline = Pipeline.create(options);
        List<String> input = Arrays.asList("A","b","c","D");
        pipeline.apply(Create.of(input)).apply(TextIO.write().to("D:\\untitled\\output\\na").withSuffix(".txt"));
        pipeline.run().waitUntilFinish();
        System.out.println("bye");

    }

}
