package org.broadinstitute.hellbender.cmdline;

/**
 * A set of String constants in which the name of the constant (minus the _SHORT_NAME suffix)
 * is the standard long Option name, and the value of the constant is the standard shortName.
 */
public final class StandardArgumentDefinitions {
    private StandardArgumentDefinitions(){}

    public static final String INPUT_LONG_NAME = "input";
    public static final String OUTPUT_LONG_NAME = "output";
    public static final String REFERENCE_LONG_NAME = "reference";
    public static final String VARIANT_LONG_NAME = "variant";
    public static final String FEATURE_LONG_NAME = "feature";
    public static final String INTERVALS_LONG_NAME = "intervals";
    public static final String READ_INDEX_LONG_NAME = "readIndex";
    public static final String USE_ORIGINAL_QUALITIES_LONG_NAME = "use-original-qualities";
    public static final String LENIENT_LONG_NAME = "lenient";
    public static final String VERBOSITY_NAME = "verbosity";
    public static final String READ_VALIDATION_STRINGENCY_LONG_NAME = "read-validation-stringency";
    public static final String ASSUME_SORTED_LONG_NAME = "assume-sorted";
    public static final String READ_FILTER_LONG_NAME = "read-filter";
    public static final String DISABLE_READ_FILTER_LONG_NAME = "disable-read-filter";
    public static final String DISABLE_TOOL_DEFAULT_READ_FILTERS = "disable-tool-default-read-filters";
    public static final String CREATE_OUTPUT_BAM_INDEX_LONG_NAME = "create-output-bam-index";
    public static final String CREATE_OUTPUT_BAM_MD5_LONG_NAME = "create-output-bam-md5";
    public static final String CREATE_OUTPUT_VARIANT_INDEX_LONG_NAME = "create-output-variant-index";
    public static final String CREATE_OUTPUT_VARIANT_MD5_LONG_NAME = "create-output-variant-md5";
    public static final String METRIC_ACCUMULATION_LEVEL_LONG_NAME = "metric-accumulation-level";
    public static final String CLOUD_PREFETCH_BUFFER_LONG_NAME = "cloud-prefetch-buffer";
    public static final String CLOUD_INDEX_PREFETCH_BUFFER_LONG_NAME = "cloud-index-prefetch-buffer";
    public static final String DISABLE_BAM_INDEX_CACHING_LONG_NAME = "disable-bam-index-caching";
    public static final String DISABLE_SEQUENCE_DICT_VALIDATION_NAME = "disable-sequence-dictionary-validation";
    public static final String ADD_OUTPUT_SAM_PROGRAM_RECORD = "add-output-sam-program-record";
    public static final String ADD_OUTPUT_VCF_COMMANDLINE = "add-output-vcf-command-line";
    public static final String SEQUENCE_DICTIONARY_NAME = "sequence-dictionary";
    public static final String ANNOTATION_LONG_NAME = "annotation";
    public static final String ANNOTATION_GROUP_LONG_NAME = "annotation-group";
    public static final String ANNOTATIONS_TO_EXCLUDE_LONG_NAME = "annotations-to-exclude";

    public static final String INPUT_SHORT_NAME = "I";
    public static final String OUTPUT_SHORT_NAME = "O";
    public static final String REFERENCE_SHORT_NAME = "R";
    public static final String VARIANT_SHORT_NAME = "V";
    public static final String FEATURE_SHORT_NAME = "F";
    public static final String INTERVALS_SHORT_NAME = "L";
    public static final String READ_INDEX_SHORT_NAME = READ_INDEX_LONG_NAME;
    public static final String LENIENT_SHORT_NAME = "LE";
    public static final String READ_VALIDATION_STRINGENCY_SHORT_NAME = "VS";
    public static final String SAMPLE_ALIAS_SHORT_NAME = "ALIAS";
    public static final String LIBRARY_NAME_SHORT_NAME = "LIB";
    public static final String EXPECTED_INSERT_SIZE_SHORT_NAME = "INSERT";
    public static final String METRICS_FILE_SHORT_NAME = "M";
    public static final String ASSUME_SORTED_SHORT_NAME = "AS";
    public static final String PF_READS_ONLY_SHORT_NAME = "PF";
    public static final String MINIMUM_MAPPING_QUALITY_SHORT_NAME = "MQ";
    public static final String READ_GROUP_ID_SHORT_NAME = "RG";
    public static final String PROGRAM_RECORD_ID_SHORT_NAME = "PG";
    public static final String MINIMUM_LOD_SHORT_NAME = "LOD";
    public static final String SORT_ORDER_SHORT_NAME = "SO";
    public static final String USE_ORIGINAL_QUALITIES_SHORT_NAME = "OQ";
    public static final String READ_FILTER_SHORT_NAME = "RF";
    public static final String DISABLE_READ_FILTER_SHORT_NAME = "DF";
    public static final String CREATE_OUTPUT_BAM_INDEX_SHORT_NAME = "OBI";
    public static final String CREATE_OUTPUT_BAM_MD5_SHORT_NAME = "OBM";
    public static final String CREATE_OUTPUT_VARIANT_INDEX_SHORT_NAME = "OVI";
    public static final String CREATE_OUTPUT_VARIANT_MD5_SHORT_NAME = "OVM";
    public static final String METRIC_ACCUMULATION_LEVEL_SHORT_NAME = "LEVEL";
    public static final String CLOUD_PREFETCH_BUFFER_SHORT_NAME = "CPB";
    public static final String CLOUD_INDEX_PREFETCH_BUFFER_SHORT_NAME = "CIPB";
    public static final String DISABLE_BAM_INDEX_CACHING_SHORT_NAME = "DBIC";
    public static final String ANNOTATION_SHORT_NAME = "A";
    public static final String ANNOTATION_GROUP_SHORT_NAME = "G";
    public static final String ANNOTATIONS_TO_EXCLUDE_SHORT_NAME = "AX";

    public static final String SPARK_PROPERTY_NAME = "conf";

    public static final String BQSR_TABLE_SHORT_NAME = "bqsr";
    public static final String BQSR_TABLE_LONG_NAME = "bqsr-recal-file";

    /**
     * The option specifying a main configuration file.
     * This is used in {@link org.broadinstitute.hellbender.Main} to control which config file is loaded.
     */
    public static final String GATK_CONFIG_FILE_OPTION = "gatk-config-file";
}
