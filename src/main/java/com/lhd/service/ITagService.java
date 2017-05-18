package com.lhd.service;


import com.lhd.entity.Tag;

import java.util.List;

/**
 * Created by lhd on 2017/5/14.
 * 标签
 */
public interface ITagService  {

    /**
     * 获取所有标签
     * @return
     */
    List<Tag> selectTagList();

    /**
     * 使用文章id查询所有对应的tagId
     * @param articleId
     * @return
     */
    List<String> selectTagIdByArticleId(String articleId);

    /**
     * 使用id查询tag
     * @param tagId
     * @return
     */
    Tag selectTagByTagId( String tagId);

    /**
     * 使用tagName查询tag
     * @param tagName
     * @return
     */
    Tag selectTagByTagName(String tagName);

    /**
     * 使用tagid获取对应文章
     * @param tagId
     * @return
     */
    List<String> selectArticleIdByTagId( String tagId);

}
