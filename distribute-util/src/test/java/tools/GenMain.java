package tools;

/**
 * 生产数据操作层代码
 *
 * @author hbm
 */
public class GenMain {
    public static void main(String[] args) {
        String configFile = "/generatorConfig.xml";
        try {
            String[] tableNames = new String[]{"t_export_config"
                 //   "t_export_task",
                    //"t_export_param_rule"
                    };
            GenMybatisFiles.gen(configFile, tableNames);
//            IntrospectedTable4Override
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
