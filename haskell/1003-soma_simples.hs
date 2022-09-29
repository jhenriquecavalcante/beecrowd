main :: IO ()
main = do
  a <- getLine
  b <- getLine
  let soma = read a + read b :: Int
  putStrLn $ "SOMA = " ++ show soma
