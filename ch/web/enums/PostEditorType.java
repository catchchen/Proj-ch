package com.ch.web.enums;

public enum PostEditorType implements ValueEnum{
    /**
     * Markdown editor.
     */
    MARKDOWN(0),

    /**
     * Rich text editor.
     */
    RICHTEXT(1);

    private final Integer value;

    PostEditorType(Integer value) {
        this.value = value;
    }

    /**
     *  Get enum value.
     * @return enum value
     */
    @Override
    public Integer getValue() {
        return value;
    }
}
