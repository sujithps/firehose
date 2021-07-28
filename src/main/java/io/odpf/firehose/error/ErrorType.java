package io.odpf.firehose.error;

public enum ErrorType {
    DESERIALIZATION_ERROR,
    INVALID_MESSAGE_ERROR,
    UNKNOWN_FIELDS_ERROR,
    SINK_4XX_ERROR,
    SINK_5XX_ERROR,
    SINK_UNKNOWN_ERROR
}
