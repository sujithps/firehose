package io.odpf.firehose.sink.bigquery.error;


/**
 * Descriptor interface that defines the various error descriptors and the corresponding error types.
 */
public interface ErrorDescriptor {

    /**
     * Gets the error type.
     *
     * @return BQInsertionRecordsErrorType - error type
     */
    BQRecordsErrorType getType();

    /**
     * If the implementing descriptor matches the condition as prescribed in the concrete implementation.
     *
     * @return - true if the condition matches, false otherwise.
     */
    boolean matches();

}
