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
        //����service����,ʵ������������
        ResultModel rmodel1 = itemService.queryProducts(queryString, catelog_name, price, sort, page, rows);
        //ҳ�洦�����
        model.addAttribute("queryString",queryString);
        //�������ƻ���
        model.addAttribute("catelog_name",catelog_name);
        //�۸����
        model.addAttribute("price",price);
        //�������
        model.addAttribute("sort",sort);
        model.addAttribute("result",rmodel1.getCurPage());


        return  "product_list";
    }