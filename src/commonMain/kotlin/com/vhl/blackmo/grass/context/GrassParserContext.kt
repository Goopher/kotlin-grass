package com.vhl.blackmo.grass.context

/**
 * Customization Configuration Context
 *  * date formatting
 *  * time formatting
 *  * date-time separator
 *  * trim white space
 *  * custom key mapping
 * @author blackmo18
 */
class GrassParserContext : GrassParserCtx {
    /**
     *  date formatting
     *  default value: **yyyy-MM-dd**
     */
    override var dateFormat: String = "yyyy-MM-dd"

    /**
     * time formatting
     * default value: **HH:mm**
     */
    override var timeFormat: String = "HH:mm"

    /**
     * date time separator
     * default value: **(space)**
     */
    override var dateTimeSeparator: String = " "

    /**
     * trim white spaces in csv column content
     */
    override var trimWhiteSpace: Boolean = true

    /**
     * custom key mapping from csv header to **data class** field name
     */
    override var customKeyMap: Map<String, String>? = null
}