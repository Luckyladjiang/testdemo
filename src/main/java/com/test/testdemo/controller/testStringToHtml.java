package com.test.testdemo.controller;

public abstract class testStringToHtml {
    String test = "1";
    String str = "<!DOCTYPE html>\n" +
            "<html lang=\"zh-CN\">\n" +
            "<!-- 第9天第11个2：35加入 -->\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\n" +
            "    <meta name=\"description\" content=\"\">\n" +
            "    <meta name=\"author\" content=\"\">\n" +
            "    <meta http-equiv=\"pragma\" content=\"no-cache\" />\n" +
            "    <meta http-equiv=\"content-type\" content=\"no-cache, must-revalidate\" />\n" +
            "    <title>在线教育网--${courseBase.name}</title>\n" +
            "</head>\n" +
            "<body data-spy=\"scroll\" data-target=\"#articleNavbar\" data-offset=\"150\">\n" +
            "<!-- 页面头部 -->\n" +
            "<!--#include virtual=\"/include/header.html\"-->\n" +
            "<div id=\"body\">\n" +
            "<!--页面头部结束sss-->\n" +
            "<div class=\"article-banner\">\n" +
            "    <div class=\"banner-bg\"></div>\n" +
            "    <div class=\"banner-info\">\n" +
            "        <div class=\"banner-left\">\n" +
            "            <p class=\"tit\">${courseBase.name}</p>\n" +
            "            <p class=\"pic\"><span class=\"new-pic\">特惠价格￥${(courseMarket.price)!\"\"}</span> <span class=\"old-pic\">原价￥${(courseMarket.price_old)!\"\"}</span></p>\n" +
            "            <p class=\"info\">\n" +
            "                <a href=\"http://ucenter.xuecheng.com/#/learning/${courseBase.id}/0\"  target=\"_blank\" v-if=\"learnstatus == 1\" v-cloak>马上学习</a>\n" +
            "                <a href=\"#\"  @click=\"addopencourse\" v-if=\"learnstatus == 2\" v-cloak>立即报名</a>\n" +
            "                <a href=\"#\"  @click=\"buy\" v-if=\"learnstatus == 3\" v-cloak>立即购买</a>\n" +
            "                <span><em>难度等级</em>\n" +
            "\t\t <#if courseBase.grade=='200001'>\n" +
            "\t\t低级\n" +
            "                <#elseif courseBase.grade=='200002'>\n" +
            "\t\t中级\n" +
            "\t\t <#elseif courseBase.grade=='200003'>\n" +
            "\t\t高级\n" +
            "\t\t</#if>\n" +
            "                </span>\n" +
            "                <span><em>课程时长</em><stat v-text=\"course_stat.s601001\"></stat>\n" +
            "                </span>\n" +
            "                <span><em>评分</em><stat v-text=\"course_stat.s601002\"></stat></span>\n" +
            "                <span><em>授课模式</em>\n" +
            "                  <#if courseBase.studymodel=='201001'>\n" +
            "\t\t自由学习\n" +
            "                <#elseif courseBase.studymodel=='201002'>\n" +
            "\t\t任务式学习\n" +
            "\t\t</#if>\n" +
            "                </span>\n" +
            "            </p>\n" +
            "        </div>\n" +
            "        <div class=\"banner-rit\">\n" +
            "\n" +
            "\t    <#if (coursePic.pic)??>\n" +
            "\t     <p><img src=\"http://img.xuecheng.com/${coursePic.pic}\" alt=\"\" width=\"270\" height=\"156\"> </p>\n" +
            "\t     <#else>\n" +
            "\t\t <p><img src=\"/static/img/widget-video.png\" alt=\"\" width=\"270\" height=\"156\"> </p>\n" +
            "\t    </#if>\n" +
            "\n" +
            "            <p class=\"vid-act\"><span> <i class=\"i-heart\"></i>收藏 <stat v-text=\"course_stat.s601003\"></stat> </span> <span>分享 <i class=\"i-weixin\"></i><i class=\"i-qq\"></i></span></p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "<div class=\"article-cont\">\n" +
            "    <div class=\"tit-list\">\n" +
            "        <a href=\"javascript:;\" id=\"articleClass\" class=\"active\">课程介绍</a>\n" +
            "        <a href=\"javascript:;\" id=\"articleItem\">目录</a>\n" +
            "        <!--<a href=\"javascript:;\" id=\"artcleAsk\">问答</a>-->\n" +
            "        <!--<div class=\"down-fill\">\n" +
            "            <span>资料下载</span>\n" +
            "            <ul>\n" +
            "                <li>java视频资料</li>\n" +
            "                <li>java视频资料</li>\n" +
            "                <li>java视频资料</li>\n" +
            "            </ul>\n" +
            "        </div>-->\n" +
            "    </div>\n" +
            "    <div class=\"article-box\">\n" +
            "        <div class=\"articleClass\" style=\"display: block\">\n" +
            "            <!--<div class=\"rit-title\">评价</div>-->\n" +
            "            <div class=\"article-cont\">\n" +
            "                <div class=\"article-left-box\">\n" +
            "                    <div class=\"content\">\n" +
            "\n" +
            "                        <div class=\"content-com suit\">\n" +
            "                            <div class=\"title\"><span>适用人群</span></div>\n" +
            "                            <div class=\"cont cktop\">\n" +
            "                                <div >\n" +
            "                                    <p>${(courseBase.users)!\"\"}</p>\n" +
            "                                </div>\n" +
            "                                <!--<span class=\"on-off\">更多 <i class=\"i-chevron-bot\"></i></span>-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"content-com course\">\n" +
            "                            <div class=\"title\"><span>课程制作</span></div>\n" +
            "                            <!--#include virtual=\"/teacher/teacher_info_template01.html\"-->\n" +
            "\n" +
            "                        </div>\n" +
            "                        <div class=\"content-com about\">\n" +
            "                            <div class=\"title\"><span>课程介绍</span></div>\n" +
            "                            <div class=\"cont cktop\">\n" +
            "                                <div >\n" +
            "                                    <p>${(courseBase.description)!\"\"}</p>\n" +
            "                                </div>\n" +
            "                                <!--<span class=\"on-off\">更多 <i class=\"i-chevron-bot\"></i></span>-->\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"content-com prob\">\n" +
            "                            <div class=\"title\"><span>常见问题</span></div>\n" +
            "                            <div class=\"cont\">\n" +
            "                                <ul>\n" +
            "                                    <li class=\"item\"><span class=\"on-off\"><i class=\"i-chevron-bot\"></i> 我什么时候能够访问课程视频与作业？</span>\n" +
            "                                        <div class=\"drop-down\">\n" +
            "                                            <p>课程安排灵活，课程费用支付提供180天全程准入和资格证书。自定进度课程建议的最后期限，但你不会受到惩罚错过期限，只要你赚你的证书在180天内。以会话为基础的课程可能要求你在截止日期前保持正轨，但如果你落后了，你可以切换到以后的会议，你完成的任何工作将与你转移。</p>\n" +
            "                                        </div>\n" +
            "                                    </li>\n" +
            "                                    <li class=\"item\"><span class=\"on-off\"><i class=\"i-chevron-bot\"></i> 如何需要额外的时间来完成课程会怎么样？</span>\n" +
            "                                        <div class=\"drop-down\">\n" +
            "                                            <p>课程安排灵活，课程费用支付提供180天全程准入和资格证书。自定进度课程建议的最后期限，但你不会受到惩罚错过期限，只要你赚你的证书在180天内。以会话为基础的课程可能要求你在截止日期前保持正轨，但如果你落后了，你可以切换到以后的会议，你完成的任何工作将与你转移。</p>\n" +
            "                                        </div>\n" +
            "                                    </li>\n" +
            "                                    <li class=\"item\"><span class=\"on-off\"><i class=\"i-chevron-bot\"></i> 我支付次课程之后会得到什么？</span>\n" +
            "                                        <div class=\"drop-down\">\n" +
            "                                            <p>课程安排灵活，课程费用支付提供180天全程准入和资格证书。自定进度课程建议的最后期限，但你不会受到惩罚错过期限，只要你赚你的证书在180天内。以会话为基础的课程可能要求你在截止日期前保持正轨，但如果你落后了，你可以切换到以后的会议，你完成的任何工作将与你转移。</p>\n" +
            "                                        </div>\n" +
            "                                    </li>\n" +
            "                                    <li class=\"item\"><span class=\"on-off\"><i class=\"i-chevron-bot\"></i> 退款条例是如何规定的？</span>\n" +
            "                                        <div class=\"drop-down\">\n" +
            "                                            <p>课程安排灵活，课程费用支付提供180天全程准入和资格证书。自定进度课程建议的最后期限，但你不会受到惩罚错过期限，只要你赚你的证书在180天内。以会话为基础的课程可能要求你在截止日期前保持正轨，但如果你落后了，你可以切换到以后的会议，你完成的任何工作将与你转移。</p>\n" +
            "                                        </div>\n" +
            "                                    </li>\n" +
            "                                    <li class=\"item\"><span class=\"on-off\"><i class=\"i-chevron-bot\"></i> 有助学金？</span>\n" +
            "                                        <div class=\"drop-down\">\n" +
            "                                            <p>课程安排灵活，课程费用支付提供180天全程准入和资格证书。自定进度课程建议的最后期限，但你不会受到惩罚错过期限，只要你赚你的证书在180天内。以会话为基础的课程可能要求你在截止日期前保持正轨，但如果你落后了，你可以切换到以后的会议，你完成的任何工作将与你转移。</p>\n" +
            "                                        </div>\n" +
            "                                    </li>\n" +
            "                                </ul>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "\n" +
            "                <div class=\"article-right-box\">\n" +
            "                    <div class=\"about-teach\">\n" +
            "                        <!--机构信息-->\n" +
            "                        <!--#include virtual=\"/company/company_info_template.html\"-->\n" +
            "\n" +
            "                    </div>\n" +
            "                    <div class=\"learing-box\">\n" +
            "                        <div class=\"tit\">看过该课的同学也在看</div>\n" +
            "                        <div class=\"item-box\">\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Linux 达人养成记</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Linux 达人养成记</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Redis从入门到精通</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Redis从入门到精通</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"articleItem\" style=\"display: none\">\n" +
            "            <div class=\"article-cont-catalog\">\n" +
            "                <div class=\"article-left-box\">\n" +
            "                    <div class=\"content\">\n" +
            "\t\t\t<#if (teachplanNode.children)??>\n" +
            "                            <#list teachplanNode.children as firstNode>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"title act\"><i class=\"i-chevron-top\"></i>${firstNode.pname}</div>\n" +
            "                                    <div class=\"about\">${firstNode.description!}</div>\n" +
            "                                    <div class=\"drop-down\" style=\"height: ${firstNode.children?size * 50}px;\">\n" +
            "                                        <ul class=\"list-box\">\n" +
            "                                            <#list firstNode.children as secondNode>\n" +
            "                                                <li>${secondNode.pname}</li>\n" +
            "                                            </#list>\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </#list>\n" +
            "                        </#if>\n" +
            "\t\t\t\t<!--\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"title act\"><i class=\"i-chevron-top\"></i>计算机原理<span class=\"time\">8小时</span></div>\n" +
            "                                    <div class=\"about\"></div>\n" +
            "                                    <div class=\"drop-down\" style=\"height: 100px;\">\n" +
            "                                        <ul class=\"list-box\">\n" +
            "                                                <li>计算机硬件 <span>66’15”</span></li>\n" +
            "                                                <li>计算机软件 <span>66’15”</span></li>\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"title act\"><i class=\"i-chevron-top\"></i>计算机编程入门<span class=\"time\">8小时</span></div>\n" +
            "                                    <div class=\"about\"></div>\n" +
            "                                    <div class=\"drop-down\" style=\"height: 100px;\">\n" +
            "                                        <ul class=\"list-box\">\n" +
            "                                                <li>java语法介绍 <span>66’15”</span></li>\n" +
            "                                                <li>Hello World <span>66’15”</span></li>\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"title act\"><i class=\"i-chevron-top\"></i>数据库编程<span class=\"time\">8小时</span></div>\n" +
            "                                    <div class=\"about\"></div>\n" +
            "                                    <div class=\"drop-down\" style=\"height: 0px;\">\n" +
            "                                        <ul class=\"list-box\">\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"title act\"><i class=\"i-chevron-top\"></i>操作系统原理<span class=\"time\">8小时</span></div>\n" +
            "                                    <div class=\"about\"></div>\n" +
            "                                    <div class=\"drop-down\" style=\"height: 100px;\">\n" +
            "                                        <ul class=\"list-box\">\n" +
            "                                                <li>操作系统原理 <span>66’15”</span></li>\n" +
            "                                                <li>操作系统类型介绍 <span>66’15”</span></li>\n" +
            "                                        </ul>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "\t\t\t\t-->\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"article-right-box\">\n" +
            "                    <div class=\"about-teach\">\n" +
            "                        <!--机构信息-->\n" +
            "                        <!--#include virtual=\"/company/company_info_template.html\"-->\n" +
            "                    </div>\n" +
            "                    <div class=\"learing-box\">\n" +
            "                        <div class=\"tit\">看过该课的同学也在看</div>\n" +
            "                        <div class=\"item-box\">\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Linux 达人养成记</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Linux 达人养成记</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Redis从入门到精通</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Redis从入门到精通</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"artcleAsk\" style=\"display: none\">\n" +
            "            <div class=\"article-cont-ask\">\n" +
            "                <div class=\"article-left-box\">\n" +
            "                    <div class=\"content\">\n" +
            "                        <div class=\"content-title\">\n" +
            "                            <p><a class=\"all\">全部</a><a>精选</a><a>我的</a></p>\n" +
            "                            <p><a class=\"all\">全部</a><span><a>1.1</a><a>1.2</a><a>1.3</a><a>1.4</a><a>1.5</a></span><a href=\"$\" class=\"more\">更多 <i class=\"i-chevron-bot\"></i></a></p>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p><span>我来回答</span></p>\n" +
            "                                <p>2017-3-20 <span><i></i>回答2</span><span><i></i>浏览2</span></p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p>在讨论如何将重构转化为微服务之前，退后一步，仔细观察微服务的内容和时间是很重要的。以下两个要点将会对任何微服务重构策略产生重大影响。 【最新 <i class=\"new\">心跳347890</i> 的回答】</p>\n" +
            "                                <p>2017-3-20 <span class=\"action-box\"><span><i class=\"i-answer\"></i>回答 2</span><span><i class=\"i-browse\"></i>浏览 12</span></span>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p>在讨论如何将重构转化为微服务之前，退后一步，仔细观察微服务的内容和时间是很重要的。以下两个要点将会对任何微服务重构策略产生重大影响。 【最新 <i class=\"new\">心跳347890</i> 的回答】</p>\n" +
            "                                <p>2017-3-20 <span class=\"action-box\"><span><i class=\"i-answer\"></i>回答 2</span><span><i class=\"i-browse\"></i>浏览 12</span></span>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p>在讨论如何将重构转化为微服务之前，退后一步，仔细观察微服务的内容和时间是很重要的。以下两个要点将会对任何微服务重构策略产生重大影响。 【最新 <i class=\"new\">心跳347890</i> 的回答】</p>\n" +
            "                                <p>2017-3-20 <span class=\"action-box\"><span><i class=\"i-answer\"></i>回答 2</span><span><i class=\"i-browse\"></i>浏览 12</span></span>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p>在讨论如何将重构转化为微服务之前，退后一步，仔细观察微服务的内容和时间是很重要的。以下两个要点将会对任何微服务重构策略产生重大影响。 【最新 <i class=\"new\">心跳347890</i> 的回答】</p>\n" +
            "                                <p>2017-3-20 <span class=\"action-box\"><span><i class=\"i-answer\"></i>回答 2</span><span><i class=\"i-browse\"></i>浏览 12</span></span>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"item\">\n" +
            "                            <div class=\"item-left\">\n" +
            "                                <p><img src=\"/static/img/widget-myImg.jpg\" width=\"60px\" alt=\"\"></p>\n" +
            "                                <p>毛老师</p>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-right\">\n" +
            "                                <p class=\"title\">如何用微服务重构应用程序?</p>\n" +
            "                                <p>在讨论如何将重构转化为微服务之前，退后一步，仔细观察微服务的内容和时间是很重要的。以下两个要点将会对任何微服务重构策略产生重大影响。 【最新 <i class=\"new\">心跳347890</i> 的回答】</p>\n" +
            "                                <p>2017-3-20 <span class=\"action-box\"><span><i class=\"i-answer\"></i>回答 2</span><span><i class=\"i-browse\"></i>浏览 12</span></span>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "\n" +
            "                        <div class=\"itemlast\">\n" +
            "                            <a href=\"#\" class=\"overwrite\">显示更多问题</a>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"article-right-box\">\n" +
            "                    <div class=\"about-teach\">\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <!--机构logo-->\n" +
            "                            <img src=\"/static/img/asset-logo.png\" width=\"40px\" alt=\"\">\n" +
            "                            <p>北京传智播客教育集团</p>\n" +
            "                        </div>\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <ul class=\"tree-list\">\n" +
            "                                <li><p class=\"item-tt\">好评度</p><span class=\"item-num\">  97%  </span></li>\n" +
            "                                <li><p class=\"item-tt\">课程数</p><span class=\"item-num js-item-num\" >234</span></li>\n" +
            "                                <li><p class=\"item-tt\">学生数</p><span class=\"item-num js-item-num\" >78383</span></li>\n" +
            "                            </ul>\n" +
            "                        </div>\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <p><a href=\"#\" class=\"courselist_link\">TA的课程</a></p>\n" +
            "                        </div>\n" +
            "\n" +
            "                        <p class=\"synopsis\">传智播客是一家专门致力于高素质软件开发人才培养的高科技公司。传智播客致力于为企业优选一流的人才的培训理念，以“学员自学入门教程，通过基础考核后进行强化培训”为招生原则，以“针对企业需求，重视基础理论建设，强化高端应用技能”为教学目标，以“高薪保证强大的资深教育团队”为教学后盾，彻底解决所有培训学员的后顾之忧，并解决用人企业难以招聘到合格人才的困扰。</p>\n" +
            "                    </div>\n" +
            "                    <div class=\"learing-box\">\n" +
            "                        <div class=\"tit\">看过该课的同学也在看</div>\n" +
            "                        <div class=\"item-box\">\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Linux 达人养成记</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Linux 达人养成记</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Redis从入门到精通</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Redis从入门到精通</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "\n" +
            "        <div class=\"artcleCod\" style=\"display: none;\">\n" +
            "            <div class=\"article-cont\">\n" +
            "                <div class=\"article-left-box\">\n" +
            "                    <div class=\"comment-box\">\n" +
            "                        <div class=\"evaluate\">\n" +
            "                            <div class=\"eva-top\">\n" +
            "                                <div class=\"tit\">课程评分 </div>\n" +
            "                                <div class=\"star\">\n" +
            "                                    <div class=\"score\"><i>5</i></div>\n" +
            "                                </div><span class=\"star-score\"> <i>5</i> 分</span></div>\n" +
            "                            <div class=\"eva-cont\">\n" +
            "                                <div class=\"tit\">学员评语 </div>\n" +
            "                                <div class=\"text-box\">\n" +
            "                                    <textarea class=\"form-control\" rows=\"5\" placeholder=\"扯淡、吐槽、表扬、鼓励......想说啥说啥！\"></textarea>\n" +
            "                                    <div class=\"text-right\"><span>发表评论</span></div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div class=\"course-evaluate\">\n" +
            "                            <div class=\"top-tit\">评论\n" +
            "                                    <span>\n" +
            "                        <label><input name=\"eval\" type=\"radio\" value=\"\" checked /> 所有学生 </label>\n" +
            "                        <label><input name=\"eval\" type=\"radio\" value=\"\" /> 完成者 </label>\n" +
            "                    </span>\n" +
            "                            </div>\n" +
            "                            <div class=\"top-cont\">\n" +
            "                                <div class=\"cont-top-left\">\n" +
            "                                    <div class=\"star-scor\">\n" +
            "                                        <div class=\"star-show\">\n" +
            "                                            <div class=\"score\"><i>5</i></div>\n" +
            "                                        </div>\n" +
            "                                        <div class=\"scor\">4.9分</div>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"all-scor\">总评分：12343</div>\n" +
            "                                </div>\n" +
            "                                <div class=\"cont-top-right\">\n" +
            "                                    <div class=\"star-grade\">五星\n" +
            "                                        <div class=\"grade\">\n" +
            "                                            <div class=\"grade-percent\"><span></span></div>\n" +
            "                                            <div class=\"percent-num\"><i>95</i>%</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"star-grade\">四星\n" +
            "                                        <div class=\"grade\">\n" +
            "                                            <div class=\"grade-percent\"><span></span></div>\n" +
            "                                            <div class=\"percent-num\"><i>5</i>%</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"star-grade\">三星\n" +
            "                                        <div class=\"grade\">\n" +
            "                                            <div class=\"grade-percent\"><span></span></div>\n" +
            "                                            <div class=\"percent-num\"><i>0</i>%</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"star-grade\">二星\n" +
            "                                        <div class=\"grade\">\n" +
            "                                            <div class=\"grade-percent\"><span></span></div>\n" +
            "                                            <div class=\"percent-num\"><i>2</i>%</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"star-grade\">一星\n" +
            "                                        <div class=\"grade\">\n" +
            "                                            <div class=\"grade-percent\"><span></span></div>\n" +
            "                                            <div class=\"percent-num\"><i>1</i>%</div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <div class=\"comment-item-box\">\n" +
            "                                <div class=\"title\">评论 <span>12453条评论</span></div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"item-left\">\n" +
            "                                        <p><img src=\"/static/img/widget-pic.png\" width=\"60px\" alt=\"\"></p>\n" +
            "                                        <p>毛老师</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-cent\">\n" +
            "                                        <p>很受用，如果再深入下就更好了。虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！</p>\n" +
            "                                        <p class=\"time\">2017-2-43</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-rit\">\n" +
            "                                        <p>\n" +
            "                                        <div class=\"star-show\">\n" +
            "                                            <div class=\"score\"><i>4</i></div>\n" +
            "                                        </div>\n" +
            "                                        </p>\n" +
            "                                        <p>评分 <span>5星</span></p>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"item-left\">\n" +
            "                                        <p><img src=\"/static/img/widget-pic.png\" width=\"60px\" alt=\"\"></p>\n" +
            "                                        <p>毛老师</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-cent\">\n" +
            "                                        <p>很受用，如果再深入下就更好了。虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！</p>\n" +
            "                                        <p class=\"time\">2017-2-43</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-rit\">\n" +
            "                                        <p>\n" +
            "                                        <div class=\"star-show\">\n" +
            "                                            <div class=\"score\"><i>5</i></div>\n" +
            "                                        </div>\n" +
            "                                        </p>\n" +
            "                                        <p>评分 <span>5星</span></p>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"item-left\">\n" +
            "                                        <p><img src=\"/static/img/widget-pic.png\" width=\"60px\" alt=\"\"></p>\n" +
            "                                        <p>毛老师</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-cent\">\n" +
            "                                        <p>很受用，如果再深入下就更好了。虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！</p>\n" +
            "                                        <p class=\"time\">2017-2-43</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-rit\">\n" +
            "                                        <p>\n" +
            "                                        <div class=\"star-show\">\n" +
            "                                            <div class=\"score\"><i>5</i></div>\n" +
            "                                        </div>\n" +
            "                                        </p>\n" +
            "                                        <p>评分 <span>5星</span></p>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"item\">\n" +
            "                                    <div class=\"item-left\">\n" +
            "                                        <p><img src=\"/static/img/widget-pic.png\" width=\"60px\" alt=\"\"></p>\n" +
            "                                        <p>毛老师</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-cent\">\n" +
            "                                        <p>很受用，如果再深入下就更好了。虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！虽然都是入门级别的，但是也很使用，后续就需要自己发挥了！</p>\n" +
            "                                        <p class=\"time\">2017-2-43</p>\n" +
            "                                    </div>\n" +
            "                                    <div class=\"item-rit\">\n" +
            "                                        <p>\n" +
            "                                        <div class=\"star-show\">\n" +
            "                                            <div class=\"score\"><i>5</i></div>\n" +
            "                                        </div>\n" +
            "                                        </p>\n" +
            "                                        <p>评分 <span>5星</span></p>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"get-more\">页面加载中...</div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"article-right-box\">\n" +
            "                    <div class=\"about-teach\">\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <!--机构logo-->\n" +
            "                            <img src=\"/static/img/asset-logo.png\" width=\"40px\" alt=\"\">\n" +
            "                            <p>北京传智播客教育集团</p>\n" +
            "                        </div>\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <ul class=\"tree-list\">\n" +
            "                                <li><p class=\"item-tt\">好评度</p><span class=\"item-num\">  97%  </span></li>\n" +
            "                                <li><p class=\"item-tt\">课程数</p><span class=\"item-num js-item-num\" >234</span></li>\n" +
            "                                <li><p class=\"item-tt\">学生数</p><span class=\"item-num js-item-num\" >78383</span></li>\n" +
            "                            </ul>\n" +
            "                        </div>\n" +
            "                        <div class=\"teach-info\">\n" +
            "                            <p><a href=\"#\" class=\"courselist_link\">TA的课程</a></p>\n" +
            "                        </div>\n" +
            "\n" +
            "                        <p class=\"synopsis\">传智播客是一家专门致力于高素质软件开发人才培养的高科技公司。传智播客致力于为企业优选一流的人才的培训理念，以“学员自学入门教程，通过基础考核后进行强化培训”为招生原则，以“针对企业需求，重视基础理论建设，强化高端应用技能”为教学目标，以“高薪保证强大的资深教育团队”为教学后盾，彻底解决所有培训学员的后顾之忧，并解决用人企业难以招聘到合格人才的困扰。</p>\n" +
            "                    </div>\n" +
            "                    <div class=\"learing-box\">\n" +
            "                        <div class=\"tit\">看过该课的同学也在看</div>\n" +
            "                        <div class=\"item-box\">\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Linux 达人养成记</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Linux 达人养成记</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <div class=\"item-list hov\" >\n" +
            "                                <div class=\"infobox\">\n" +
            "                                    <div class=\"morebox\" style=\"background: url(/static/img/widget-titBg.png) no-repeat;\">\n" +
            "\n" +
            "                                        <p class=\"top-tit\"><a href=\"\">Redis从入门到精通</a></p>\n" +
            "                                        <p class=\"top-lab\">传智播客</p>\n" +
            "                                        <p class=\"top-num\">2589646次播放<span>4.8分</span></p>\n" +
            "\n" +
            "                                    </div>\n" +
            "                                    <a>Redis从入门到精通</a>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "\n" +
            "                        </div>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "\n" +
            "<div class=\"popup-box\" style=\"display: none\">\n" +
            "    <div class=\"mask\"></div>\n" +
            "    <!--欢迎访问课程弹窗- start -->\n" +
            "  <!--  <div class=\"popup-course-box\">\n" +
            "        <div class=\"title\">程序设计语言 <span class=\"close-popup\">×</span></div>\n" +
            "        <div class=\"content\">\n" +
            "            <p>欢迎学习本课程，您现在可以访问课程材料了。</p>\n" +
            "            <p><a href=\"#\">开始学习</a></p>\n" +
            "        </div>\n" +
            "    </div>-->\n" +
            "    <!--欢迎访问课程弹窗- end -->\n" +
            "\n" +
            "    <!--支付弹窗- start -->\n" +
            "    <div class=\"popup-pay-box\">\n" +
            "        <div class=\"title\">Bootstrap开发框架 <span class=\"close-popup\">×</span></div>\n" +
            "        <div class=\"content\">\n" +
            "            <img src=\"./text.png\" alt=\"\">\n" +
            "            <div class=\"info\">\n" +
            "                <p class=\"info-tit\">Bootstrap开发框架 <span>课程有效期:2017年9月12日-2018年9月11日</span></p>\n" +
            "                <p class=\"info-pic\">课程价格 : <span>￥98</span></p>\n" +
            "                <p class=\"info-new-pic\">优惠价格 : <span>￥98</span></p>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "       <!-- <div class=\"fact-pic\">实际支付: <span>￥999</span></div>-->\n" +
            "        <div class=\"go-pay\"><a href=\"#\" @click=\"createOrder\" :loading=\"editLoading\"> 确认无误，提交订单</a><!--<a class=\"addCar\" href=\"\">加入购物车</a>--></div>\n" +
            "    </div>\n" +
            "    <!--支付弹窗- end -->\n" +
            "    <div class=\"popup-comment-box\">\n" +
            "\n" +
            "    </div>\n" +
            "</div>\n" +
            "<!-- 页面底部 -->\n" +
            "<!--底部版权-->\n" +
            "<!--#include virtual=\"/include/footer.html\"-->\n" +
            "\n" +
            "<!--底部版权-->\n" +
            "</div>\n" +
            "<script>var courseId = \"${courseBase.id}\"</script>\n" +
            "<!--#include virtual=\"/include/course_detail_dynamic.html\"-->\n" +
            "</body>\n" +
            "</html>";
}
