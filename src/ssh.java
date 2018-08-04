 public String showList(String queryString,
                           String catelog_name,
                           String price,
                           @RequestParam(defaultValue = "1")
                           String sort,
                           @RequestParam(defaultValue = "1")
                           Integer page,
                           @RequestParam(defaultValue = "1")
                           Integer rows,
                           Model model){
        //调用service方法,实现索引库搜索
        ResultModel rmodel1 = itemService.queryProducts(queryString, catelog_name, price, sort, page, rows);
        //页面处理回显
        model.addAttribute("queryString",queryString);
        //分类名称回显
        model.addAttribute("catelog_name",catelog_name);
        //价格回显
        model.addAttribute("price",price);
        //排序回显
        model.addAttribute("sort",sort);
        model.addAttribute("result",rmodel1.getCurPage());


        return  "product_list";
    }