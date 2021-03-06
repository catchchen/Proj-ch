package com.ch.pojo.entity;

//import com.ch.web.enums.CommentStatus;
import lombok.Data;

/**
 * @author chenk
 * @date 2022/3/20 12:05
 * @description 文章评论类
 */
@Data
public class ArticleComment {
    private Long id;

    /**
     * Commentator's name.
     */

    private String author;

    /**
     * Commentator's email.
     */

    private String email;

    /**
     * Commentator's ip address.
     */

    private String ipAddress;

    /**
     * Commentator's website.
     */

    private String authorUrl;

    /**
     * Gravatar md5
     */

    private String gravatarMd5;

    /**
     * Comment content.
     */

    private String content;

    /**
     * Comment status.
     */
//    private CommentStatus status;

    /**
     * Commentator's userAgent.
     */
    private String userAgent;

    /**
     * Is admin's comment.
     */

    private Boolean isAdmin;

    /**
     * Allow notification.
     */

    private Boolean allowNotification;

    /**
     * Post id.
     */

    private Integer postId;

    /**
     * Whether to top the comment.
     */

    private Integer topPriority;

    /**
     * Parent comment.
     */

    private Long parentId;

}
