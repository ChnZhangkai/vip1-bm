//省、市、区
var region_init = function (_region_p, _region_c, _region_d, _region_p_default, _region_c_default, _region_d_default) {
    var region_p = document.getElementById(_region_p);
    var region_c = document.getElementById(_region_c);
    var region_d = document.getElementById(_region_d);

    function option_items_select(cmb, value) {
        for (var i = 0; i < cmb.options.length; i++) {
            if (cmb.options[i].value == value) {
                cmb.selectedIndex = i;
                return;

            }
        }
    }

    //附加value、text
    function option_items_add(cmb, value, text, obj, i) {
        var option = document.createElement("OPTION");
        cmb.options.add(option);
        option.innerText = text;
        option.value = value;
        option.obj = obj;
    }

    function region_c_change() {
        region_d.options.length = 0;
        if (region_c.selectedIndex == -1)return;
        var item = region_c.options[region_c.selectedIndex].obj;
        for (var i = 0; i < item.district.length; i++) {
            option_items_add(region_d, item.district[i].id, item.district[i].name, null, i);
        }
        option_items_select(region_d, _region_d_default);
    }

    function region_p_change() {
        region_c.options.length = 0;
        region_c.onchange = null;
        if (region_p.selectedIndex == -1)return;
        var item = region_p.options[region_p.selectedIndex].obj;
        for (var i = 0; i < item.city.length; i++) {
            option_items_add(region_c, item.city[i].id, item.city[i].name, item.city[i], i);
        }
        option_items_select(region_c, _region_c_default);
        region_c_change();
        region_c.onchange = region_c_change;
    }

    for (var i = 0; i < province_enum.length; i++) {
    	debugger;
        option_items_add(region_p, province_enum[i].id, province_enum[i].name, province_enum[i]);
    }
    option_items_select(region_p, _region_p_default);
    region_p_change();
    region_p.onchange = region_p_change;
}
