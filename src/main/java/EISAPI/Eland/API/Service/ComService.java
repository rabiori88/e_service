package EISAPI.Eland.API.Service;

import org.springframework.stereotype.Service;

@Service
public class ComService {

    public String ConvertNewVendorCode(String oldCode, String vendorCustType)
    {
        String newVendorCode = "";
        String connectionUrl =
                "jdbc:sqlserver://10.123.185.197;" +
                        "databaseName=AdventureWorks;integratedSecurity=true;" +
                        "encrypt=true;trustServerCertificate=true";

//        using (SqlConnection conn = new SqlConnection(this.connectionString))
//        {
//            conn.Open();
//
//            try
//            {
//                String sql = @"
//                SELECT
//                ISNULL(A.NewVendorCode, @OldVendorCode) AS VendorCode
//                FROM
//                dbo.MIG_VendorCode A WITH (NOLOCK)
//                WHERE
//                A.OldVendorCode = @OldVendorCode
//                        AND A.VendorCustType = @VendorCustType";
//
//                DynamicParameters dp = new DynamicParameters();
//                dp.Add("@OldVendorCode", oldCode, DbType.StringFixedLength, ParameterDirection.Input, 10);
//                dp.Add("@VendorCustType", vendorCustType, DbType.StringFixedLength, ParameterDirection.Input, 1);
//
//                newVendorCode = conn.Query<String>(sql, dp, commandType: CommandType.Text).FirstOrDefault();
//
//                if (newVendorCode == null)
//                {
//                    newVendorCode = oldCode;
//                }
//
//            }
//            catch (Exception e)
//            {
//                newVendorCode = oldCode;
//                //log.Error(e);
//            }
//        }

        return newVendorCode;
    }
}
