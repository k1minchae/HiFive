module.exports = {
  root: true,
  env: {
    browser: true,
    es2021: true,
  },

  extends: [
    "airbnb",
    "plugin:react/recommended",
    "plugin:react-hooks/recommended",
    "prettier",
    "plugin:@typescript-eslint/recommended",
  ],

  ignorePatterns: ["build", "dist", "public"],

  parser: "@typescript-eslint/parser",

  parserOptions: {
    ecmaFeatures: {
      jsx: true,
    },
    ecmaVersion: 12,
    sourceType: "module",
  },

  plugins: ["react", "react-hooks", "prettier", "@typescript-eslint"],

  rules: {
    "prettier/prettier": ["error"],
    "react/jsx-filename-extension": [
      1,
      { extensions: [".js", ".jsx", ".ts", ".tsx"] },
    ],
    "import/no-extraneous-dependencies": ["error", { devDependencies: true }],
    "react/react-in-jsx-scope": "off",
    "react/jsx-uses-react": "off",
    "@typescript-eslint/no-unused-vars": "error",
    "import/extensions": [
      "error",
      "ignorePackages",
      {
        js: "never",
        jsx: "never",
        ts: "never",
        tsx: "never",
      },
    ],
  },

  settings: {
    react: {
      version: "detect",
    },
    "import/resolver": {
      node: {
        extensions: [".js", ".jsx", ".ts", ".tsx"],
      },
    },
  },
};
